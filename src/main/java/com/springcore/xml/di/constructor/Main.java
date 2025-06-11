package com.springcore.xml.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorbean.xml");
        Marks marks = context.getBean("marks", Marks.class);
        marks.getStudentMarks();
    }
}

