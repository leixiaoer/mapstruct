package com.example.mapstruct.demo;

import java.util.ArrayList;
import java.util.Date;

/*
 *文件名: test
 *创建者: leo
 *创建时间:2023/1/4 15:53
 *描述: TODD
 */
public class MapstructTest {
    public static void main(String[] args) {
        PersonDO personDO = new PersonDO();
        personDO.setName("Hollis");
        personDO.setAge(26);
        personDO.setBirthday(new Date());
        personDO.setId(1);
        personDO.setGender(Gender.PersonName.getName());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        personDO.setStringList(strings);

        PersonDTO personDTO = PersonConverter.INSTANCE.do2dto(personDO);
        System.out.println(personDTO);


        PersonDTOPlus personDTOPlus = PersonConverter.INSTANCE.doubledo2dto(personDO, personDTO);
        System.out.println(personDTOPlus);
    }

}
