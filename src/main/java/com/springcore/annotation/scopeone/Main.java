package com.springcore.annotation.scopeone;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.scopeone");

        Subject physics = context.getBean("subject", Subject.class);
        physics.setSubjectMarks(95);

        log.info("Physics Hashcode : {}", physics.hashCode());
        log.info("Physics Marks : {}", physics);

        Subject mathematics = context.getBean("subject", Subject.class);
        mathematics.setSubjectMarks(100);

        log.info("Mathematics Hashcode : {}", mathematics.hashCode());
        log.info("Mathematics Marks : {}", mathematics);

        log.info("UPDATED Physics Hashcode : {}", physics.hashCode());
        log.info("UPDATED PHYSICS MARKS!! : {}", physics);
    }
}
