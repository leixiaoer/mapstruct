package com.example.mapstruct.improve;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
 
    private String name1;
    private int age;
    private GenderEnum gender;
    private Double height;
    private Date birthday;
    private List<String> demoList;
}


