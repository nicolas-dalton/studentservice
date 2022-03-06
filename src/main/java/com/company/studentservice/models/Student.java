package com.company.studentservice.models;

public class Student {
    //state property
    private String name;

    public Student(String name){
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
