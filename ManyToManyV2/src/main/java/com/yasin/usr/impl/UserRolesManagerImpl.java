package com.yasin.usr.impl;

import com.yasin.dao.UserRolesDAO;
import com.yasin.dao.impl.AbsImpl;
import com.yasin.model.Roles;
import com.yasin.model.User;
import com.yasin.model.UserRoles;
import com.yasin.usr.UserRolesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yasintulumen on 19/07/2017.
 */
@Service(value = "userRolesManager")
public class UserRolesManagerImpl extends AbsManagerImpl<UserRoles> implements UserRolesManager {


}
