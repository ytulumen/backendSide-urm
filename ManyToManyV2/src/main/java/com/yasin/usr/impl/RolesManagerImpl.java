package com.yasin.usr.impl;

import com.yasin.dao.RolesDAO;
import com.yasin.model.Roles;
import com.yasin.model.User;
import com.yasin.usr.AbsManager;
import com.yasin.usr.impl.AbsManagerImpl;
import com.yasin.usr.RolesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yasintulumen on 19/07/2017.
 */
@Service(value = "rolesManager")
public class RolesManagerImpl extends AbsManagerImpl<Roles> implements RolesManager {


}
