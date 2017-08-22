package com.intelisoft.dao.impl;

import com.intelisoft.entity.City;
import com.intelisoft.farma.api.dao.ICityDao;

/**
 * Created by Alex on 19.08.2017.
 */
public class CitiDaoImpl extends AbstractDaoImpl<City> implements ICityDao {


    public CitiDaoImpl() {
        super(City.class);
    }
}
