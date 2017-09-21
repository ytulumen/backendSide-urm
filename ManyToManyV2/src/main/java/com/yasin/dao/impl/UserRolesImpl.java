package com.yasin.dao.impl;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import com.yasin.dao.UserRolesDAO;
import com.yasin.model.Roles;
import com.yasin.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yasin.model.UserRoles;
import com.yasin.util.HibernateUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository(value = "userRolesDAO")
public class UserRolesImpl extends AbsImpl<UserRoles> implements UserRolesDAO {

    public UserRolesImpl() {
        super.setClassType(UserRoles.class);
    }
}
