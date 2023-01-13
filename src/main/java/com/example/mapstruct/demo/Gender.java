package com.example.mapstruct.demo;


/*
 *文件名: Gender
 *创建者: leo
 *创建时间:2023/1/4 15:42
 *描述: TODD
 */
public enum Gender {
    UseuName("hello"),
    PersonName("world");

    Gender(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
