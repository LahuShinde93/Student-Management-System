package com.example.student.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping("/user")
    public ResponseEntity<String> welcome(@RequestParam String user){
        return ResponseEntity.ok("hello : "+user);
    }
}
