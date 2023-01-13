package com.example.mapstruct.demo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PersonDTO {
    private String userName;
    private Integer age;
    private Date birthday;
    private String gender;
    //    private Gender gender;
    private List<String> stringList;

    private String constant;//常量
}