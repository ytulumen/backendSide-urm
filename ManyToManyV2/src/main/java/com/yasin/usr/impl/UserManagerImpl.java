package com.yasin.usr.impl;


import com.yasin.model.User;
import com.yasin.usr.UserManager;
import org.springframework.stereotype.Service;

/**
 * Created by yasintulumen on 19/07/2017.
 */

@Service(value = "userManager")
public class UserManagerImpl extends AbsManagerImpl<User> implements UserManager{

}
