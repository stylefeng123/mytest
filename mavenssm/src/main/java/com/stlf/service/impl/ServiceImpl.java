package com.stlf.service.impl;

import com.stlf.dao.Dao;
import com.stlf.domain.Domain;
import com.stlf.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * This is a Java Class
 *
 * @author stylefeng
 * @create 2018-11-08 19:15
 */

@Service
public class ServiceImpl implements Services {

    @Autowired
    private Dao dao;

    public Domain findById(Integer id) {
        Domain byId = dao.findById(id);
        return byId;
    }
}
