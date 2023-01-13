package com.example.mapstruct.demo;


import lombok.Data;

import java.util.Date;
import java.util.List;

/*
 *文件名: PersonDTOPlus
 *创建者: leo
 *创建时间:2023/1/4 17:45
 *描述: 映射两个对象的值
 */
@Data
public class PersonDTOPlus {

    private String name;
    private List<String> stringList;//集合
    private String constant;//常量
    private String defaultValue;//默认值
}
