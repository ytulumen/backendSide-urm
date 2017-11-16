package com.yasin.dao.impl;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import com.yasin.dao.UserRolesDAO;
import com.yasin.model.UserRoles;
import org.springframework.stereotype.Repository;


@Repository(value = "userRolesDAO")
public class UserRolesImpl extends AbsImpl<UserRoles> implements UserRolesDAO {

    public UserRolesImpl() {
        super.setClassType(UserRoles.class);
        super.setQuery("findUserRoleByName");

    }
}
