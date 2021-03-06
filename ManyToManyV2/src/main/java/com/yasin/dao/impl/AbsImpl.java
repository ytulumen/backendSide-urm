package com.yasin.dao.impl;

import com.yasin.dao.AbsDAO;
import com.yasin.model.AbsClass;
import com.yasin.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public abstract class AbsImpl<T extends AbsClass> implements AbsDAO<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> clazz;



    private String query;
    public void setClassType(Class clazz)
    {
        this.clazz = clazz;
    }
    public void setQuery(String query) {
        this.query = query;
    }
    @Override
    public void insert(T item) throws ParseException {
        DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
        dateTimeInstance.parse(dateTimeInstance.format(Calendar.getInstance().getTime()));
        item.setCreate(Calendar.getInstance().getTime());
        item.setUpdate(Calendar.getInstance().getTime());
        entityManager.persist(item);
    }

    @Override
    public void delete(T item) {
        entityManager.remove(entityManager.contains(item) ? item : entityManager.merge(item));

    }

    @Override
    public T findbyID(int id) {
        return entityManager.find(clazz, id);
    }

    @Override
    public void edit(T item) {

        T item1 = findbyID(item.getId());
        item1.setName(item.getName());
        //DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
        item1.setUpdate(Calendar.getInstance().getTime());
        entityManager.merge(item1);
        //entityManager.persist(oldValue);
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = builder.createQuery(clazz);
        Root<T> root = cq.from(clazz);
        cq.select(root);
        return entityManager.createQuery(cq).getResultList();
    }

    @Override
    public T findbyName(String name) {
        return entityManager.createNamedQuery(query, clazz).setParameter("name", name).getSingleResult();
    }
}
