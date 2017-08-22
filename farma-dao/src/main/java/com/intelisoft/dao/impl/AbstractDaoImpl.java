package com.intelisoft.dao.impl;


import com.intelisoft.farma.api.dao.IGenericDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class AbstractDaoImpl<T> implements IGenericDao<T> {

    private Class<T> tclass;

    protected AbstractDaoImpl(Class clas) {
        this.tclass = clas;
    }

    public void save(T obj, Session session) {
        session.save(obj);
    }

    public void delete(T obj, Session session) {
        session.delete(obj);
    }

    public void update(T obj, Session session) {
        session.update(obj);
    }

    public List<T> getAll(Session session) {
        Criteria criteria = session.createCriteria(tclass);
        criteria.list();
        return criteria.list();
    }

    public T getById(Session session, Integer id) {
        Criteria criteria = session.createCriteria(tclass);
        criteria.add(Restrictions.eq("id", id));
        return (T) criteria.list().get(0);
    }
}
