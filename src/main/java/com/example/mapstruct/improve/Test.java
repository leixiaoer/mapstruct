package com.example.mapstruct.improve;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {

//        Student student = Student.builder().name1("小明").age(6).gender(GenderEnum.Male).height(121.1).birthday(new Date()).build();
//        System.out.println(student);
//        //这行代码便是实际要用的代码
//        StudentVO studentVO = StudentMapper.INSTANCE.student2StudentVO(student);
//        System.out.println(studentVO);

        /**
         * 测试单个映射不存在的情况下，是否能将非自动映射能成功的映射，如果不能，然后再添加单个映射后，能进行集合映射，那么就存在依赖关系
         * 最终确定，集合映射和单个映射存在依赖关系
         */
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");

        Student studentItme = Student.builder().name1("小明").age(6).gender(GenderEnum.Male).height(121.1).birthday(new Date()).demoList(strings).build();

        List<Student> list = new ArrayList<>();
        list.add(studentItme);


        List<StudentVO> result = StudentMapper.INSTANCE.students2StudentVOs(list);
        System.out.println(result);


    }

}