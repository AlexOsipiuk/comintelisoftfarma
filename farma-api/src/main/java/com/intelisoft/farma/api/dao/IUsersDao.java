package com.intelisoft.farma.api.dao;

import com.intelisoft.entity.Users;
import org.hibernate.Session;

public interface IUsersDao extends IGenericDao<Users> {

    //  !!!!!

    public void foundByName(Session session);
}
