package com.university.Training.controller;

import com.university.Training.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/print-name") //http get request
    public String printStudentName(){
        return studentService.printName("Abdulrahman");
    }





//    @GetMapping("/print-name-str") //http get request
//    public String printStudentNameStr(){
//        return "HI THERE";
//
//    }
}
