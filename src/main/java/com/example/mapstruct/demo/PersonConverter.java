package com.example.mapstruct.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//componentModel = "spring" 可配置可不配置，说实话我也不知道这个配置干什么的
@Mapper()
interface PersonConverter {
    PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);


    @Mapping(source = "name", target = "userName")
    @Mapping(source = "stringList", target = "stringList")
    @Mapping(target = "constant", constant = "映射赋值-常量")
    PersonDTO do2dto(PersonDO person);


    @Mapping(source = "person.name", target = "name")
    @Mapping(source = "person.stringList", target = "stringList")
    @Mapping(source = "person.defaultValue", target = "defaultValue")
    @Mapping(source = "personDTO.constant", target = "constant")
    PersonDTOPlus doubledo2dto(PersonDO person, PersonDTO personDTO);
}
