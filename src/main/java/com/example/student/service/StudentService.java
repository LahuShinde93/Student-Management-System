package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.globalExceptionHandler.StudentNotFoundException;
import com.example.student.repository.StudentRepository;
import com.example.student.reqDTO.StudentRegisterReqDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    public ResponseEntity<String> registerStudents(StudentRegisterReqDto stdRegister) {

        if (stdRegister == null) {
            throw new StudentNotFoundException("Student should not be null..");
        }

        Student std = new Student();
        std.setAge(stdRegister.getAge());
        std.setName(stdRegister.getName());
        std.setEmail(stdRegister.getEmail());
        std.setMobileNo(stdRegister.getMobileNo());

        studentRepo.save(std);

        return ResponseEntity.ok("Student Register Successfully!");


    }

}
