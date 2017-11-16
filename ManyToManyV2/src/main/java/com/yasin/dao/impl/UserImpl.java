package com.yasin.dao.impl;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import com.yasin.dao.UserDAO;
import com.yasin.model.User;
import org.springframework.stereotype.Repository;

@Repository(value = "userDAO")
public class UserImpl extends AbsImpl<User> implements UserDAO {

    public UserImpl() {
        super.setClassType(User.class);
        super.setQuery("findUserByName");

    }

    @Override
    public void edit(User item) {
        User item1 = findbyID(item.getId());
        item1.setPassword(item.getPassword());
        item1.setName(item.getName());
        super.edit(item1);
    }

}