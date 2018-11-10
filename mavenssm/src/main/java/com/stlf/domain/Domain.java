package com.stlf.domain;

/**
 * 描述:
 * This is a Java Class
 *
 * @author stylefeng
 * @create 2018-11-08 19:09
 */

public class Domain {
    private Integer id;
    private String name;
    private Float money;

    public Domain() {
    }

    public Domain(Integer id, String name, Float money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "domain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
