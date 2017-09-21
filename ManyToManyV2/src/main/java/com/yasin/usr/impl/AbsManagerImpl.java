package com.yasin.usr.impl;

import com.yasin.dao.AbsDAO;
import com.yasin.usr.AbsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

public abstract class AbsManagerImpl<T> implements AbsManager<T> {

    @Autowired
    private AbsDAO<T> absDAO;
    @Transactional
    @Override
    public void insert(T item) throws ParseException {
        absDAO.insert(item);
    }

    @Transactional
    @Override
    public void delete(T item) {
        absDAO.delete(item);
    }

    @Override
    public T findbyID(int id) {
        return absDAO.findbyID(id);
    }

    @Override
    public List<T> findAll() {
        return absDAO.findAll();
    }

    @Transactional
    @Override
    public void edit(T item) {
        absDAO.edit(item);
    }
}
