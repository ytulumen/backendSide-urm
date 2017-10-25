package com.yasin.dao.impl;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import com.yasin.dao.UserDAO;
import com.yasin.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;


@Repository(value = "userDAO")
public class UserImpl extends AbsImpl<User> implements UserDAO {

    public UserImpl() {
        super.setClassType(User.class);
    }

    @Override
    public void edit(User item) {
        User item1 = findbyID(item.getId());
        item1.setPassword(item.getPassword());
        super.edit(item1);
    }
    @Override
    public User findbyName(String name) {
        return entityManager.createNamedQuery("findByName", User.class).setParameter("name", name).getSingleResult();
    }
}