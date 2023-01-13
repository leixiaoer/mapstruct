package com.example.mapstruct.improve;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "name", source = "name1")
    @Mapping(target = "demoList", source = "demoList")
    @Mapping(source = "gender.name", target = "gender") //枚举获取类型，也可以自动转换
    @Mapping(source = "birthday", target = "birthday", dateFormat = "yyyy-MM-dd HH:mm:ss")
    StudentVO student2StudentVO(Student student);



    List<StudentVO> students2StudentVOs(List<Student> studentList);


    default String getGenderName(GenderEnum gender) {
        return gender.getName();
    }

}