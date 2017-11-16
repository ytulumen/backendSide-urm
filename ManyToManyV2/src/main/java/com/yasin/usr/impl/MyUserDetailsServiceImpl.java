package com.yasin.usr.impl;

import java.util.Arrays;
import java.util.List;

import com.yasin.model.UserRoles;
import com.yasin.usr.UserRolesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yasin.model.User;
import com.yasin.usr.UserManager;

@Service(value = "userDetailsService")
public class MyUserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private UserManager userManager;
    @Autowired
    private UserRolesManager userRolesManager;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userManager.findbyName(s);
        UserRoles userRoles = null;
        List<UserRoles> userRolesList = userRolesManager.findAll();
        for(UserRoles userRoles1: userRolesList ){
            if(userRoles1.getUser().getId()==user.getId())
                userRoles = userRoles1;
        }

        GrantedAuthority authority = new SimpleGrantedAuthority(userRoles.getRole().getName());
        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getName(),
                        user.getPassword(), Arrays.asList(authority));

        return userDetails;
    }
}
