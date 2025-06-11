package com.springcore.xml.di.setter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Marks {
    private String subjectName;
    private int subjectMarks;


    public void getMarks(){
        log.info("Subject Name : {} and Subject Marks : {}", subjectName, subjectMarks);
    }
}
