package com.springcore.xml.di.constructor;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Marks {
    private int studentMarks;
    private String studentSubjects;
    private Student student;

    public Marks(int studentMarks, String studentSubjects, Student student){
        this.studentMarks = studentMarks;
        this.studentSubjects = studentSubjects;
        this.student=student;
    }

    public void getStudentMarks(){
        student.getStudentDetails();
        log.info("Subject : {} and Marks : {}", studentSubjects, studentMarks);
    }
}
