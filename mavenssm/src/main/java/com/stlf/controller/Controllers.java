package com.stlf.controller;

import com.stlf.domain.Domain;
import com.stlf.service.Services;
import com.stlf.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述:
 * This is a Java Class
 *
 * @author stylefeng
 * @create 2018-11-08 19:09
 */
@Controller
@RequestMapping("/a")
public class Controllers {
    @Autowired
    private Services service;

    @RequestMapping("/b")
    public String findById() {
        Domain byId = service.findById(1);
        System.out.println(byId);
        return "succ";
    }
}
