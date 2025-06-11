package com.springcore.annotation.scopeone;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j2
@Scope
@Component
@Setter
@Getter
@ToString
public class Subject {
    private int subjectMarks;

    public Subject(){
        log.info("SUBJECT MARKS!");
    }

    public Subject(int subjectMarks) {
        this.subjectMarks = subjectMarks;
        log.info("Marks are : {}", subjectMarks);
    }
}
