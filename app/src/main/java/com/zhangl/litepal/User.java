package com.zhangl.litepal;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * Created by zhangl on 2019/1/7.
 */

public class User extends LitePalSupport{


    private int id;


    private String name;

    private String sex;

    private String age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
