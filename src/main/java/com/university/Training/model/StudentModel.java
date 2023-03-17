package com.university.Training.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentModel {

    List<String> names = new ArrayList<>();

    StudentModel(){
        names.add("Ali");
        names.add("Ahmed");
        names.add("Khaled");
    }
    public List<String> getNames(){
        return names;
    }
}
