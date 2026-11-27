package com.example.student.controller;

import com.example.student.reqDTO.StudentRegisterReqDto;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService stdService;

    @PostMapping("/register")
    public ResponseEntity<String> registerStudents(@RequestBody StudentRegisterReqDto stdRegReqDto){

        return stdService.registerStudents(stdRegReqDto);
    }
}