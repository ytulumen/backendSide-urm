package com.yasin.dao;

import java.text.ParseException;
import java.util.List;


public interface AbsDAO<T> {


    void insert(T item) throws ParseException;
    void delete(T item);
    void edit(T item);
    T findbyID(int id);
    List<T> findAll();
    T findbyName(String name);
}
