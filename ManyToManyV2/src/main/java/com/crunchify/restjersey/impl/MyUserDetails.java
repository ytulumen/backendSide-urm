package com.crunchify.restjersey.impl;

import com.yasin.model.User;
import com.yasin.usr.AbsManager;
import com.yasin.usr.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyUserDetails implements UserDetailsService{
    @Autowired
    private UserManager userManager;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<User> users = userManager.findAll();

        for (User user : users) {
            if(user.getName() == s){
                GrantedAuthority authority = new SimpleGrantedAuthority("user");
                org.springframework.security.core.userdetails.UserDetails userDetails =
                        (org.springframework.security.core.userdetails.UserDetails)
                        new org.springframework.security.core.userdetails.User(user.getName(),
                        user.getPassword(), Arrays.asList(authority));
                return userDetails;
            }
        }
        return null;
    }
}
