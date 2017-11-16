package com.yasin.dao.impl;

/**
 * Created by yasintulumen on 18/07/2017.
 */


import com.yasin.dao.RolesDAO;
import com.yasin.model.Roles;
import org.springframework.stereotype.Repository;


@Repository(value = "rolesDAO")
public class RolesImpl extends AbsImpl<Roles> implements RolesDAO {

    public RolesImpl()
    {
        super.setClassType(Roles.class);
        super.setQuery("findRoleByName");
    }

}
