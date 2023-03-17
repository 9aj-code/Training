package com.university.Training.service;

import com.university.Training.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    private StudentModel studentModel;

    public String printName(String name){
        String n = studentModel.getNames()
                .stream()
                .filter(i->i == name)
                .findAny().orElse("nothing");
        return n.toUpperCase();
    }


}