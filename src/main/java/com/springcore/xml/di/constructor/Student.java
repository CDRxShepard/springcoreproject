package com.springcore.xml.di.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }

    public void getStudentDetails(){
        log.info("Student ID : {} and Student Name :{}", studentId, studentName);
    }
}
