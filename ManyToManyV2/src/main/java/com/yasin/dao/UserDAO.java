package com.yasin.dao;

import com.yasin.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yasintulumen on 19/07/2017.
 */


public interface UserDAO extends AbsDAO<User> {

   public User findbyName(String name);

}
