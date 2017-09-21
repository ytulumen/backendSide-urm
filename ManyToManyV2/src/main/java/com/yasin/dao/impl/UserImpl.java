package com.yasin.dao.impl;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import java.util.ArrayList;
import java.util.List;

import com.yasin.dao.UserDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yasin.model.User;
import com.yasin.util.HibernateUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository(value = "userDAO")
public class UserImpl extends AbsImpl<User> implements UserDAO {

    public UserImpl() {
        super.setClassType(User.class);
    }
}