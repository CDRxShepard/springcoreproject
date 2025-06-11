package com.springcore.javabasedconfig;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
@Log4j2
public class DateMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore");

        Date date = context.getBean("currentdate", Date.class);
        log.info(date);
    }
}
