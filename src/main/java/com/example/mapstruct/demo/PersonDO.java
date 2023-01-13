package com.example.mapstruct.demo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PersonDO {
    private Integer id;
    private String name;
    private int age;
    private Date birthday;
    private String gender;
    private List<String> stringList;
    private String constant;//常量
    private String defaultValue;//默认值
}
