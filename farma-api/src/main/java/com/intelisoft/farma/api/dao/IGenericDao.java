package com.intelisoft.farma.api.dao;

import org.hibernate.Session;

import java.util.List;

public interface IGenericDao<T> {

    public void save(T obj, Session session);

    public void delete(T obj, Session session);

    public void update(T obj, Session session);

    public List<T> getAll(Session session);

    public <T> T getById(Session session, Integer id);
}
