package com.example.elasticsearch.util;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class EsModel {

    private String id = "";

    private String name = "";

    private int age = 0;

    private java.util.Date date = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDate() {
        return date;
    }
}
