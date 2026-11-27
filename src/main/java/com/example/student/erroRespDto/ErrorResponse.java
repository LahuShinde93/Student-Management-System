package com.example.student.erroRespDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorResponse {

    private LocalDateTime timeStamp;
    private int statusCode;
    private String status;
    private String msg;

}
