package com.example.student.respDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentRegisterRespDto {
    private int id;
    private String name;
    private String email;
    private String mobileNo;
    private int age;
}
