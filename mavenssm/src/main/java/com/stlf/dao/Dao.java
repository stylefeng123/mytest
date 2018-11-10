package com.stlf.dao;

import com.stlf.domain.Domain;

/**
 * 描述:
 * This is a Java Class
 *
 * @author stylefeng
 * @create 2018-11-08 19:08
 */

public interface Dao {

    Domain findById(Integer id);
}
