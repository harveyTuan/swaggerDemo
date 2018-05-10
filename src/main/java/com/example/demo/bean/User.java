package com.example.demo.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author Harvey
 * @create 2018-05-10 下午4:01
 **/

@Data
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

}
