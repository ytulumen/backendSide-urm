package com.yasin.usr.impl;

import com.yasin.dao.UserDAO;
import com.yasin.dao.impl.UserImpl;
import com.yasin.model.User;
import com.yasin.usr.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yasintulumen on 19/07/2017.
 */

@Service(value = "userManager")
public class UserManagerImpl extends AbsManagerImpl<User> implements UserManager{

}
