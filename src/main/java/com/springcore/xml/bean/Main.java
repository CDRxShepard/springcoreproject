package com.springcore.xml.bean;

import com.springcore.annotation.bean.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = applicationContext.getBean("employee", Employee.class);
        employee.setEmployeeId(5);
        employee.setEmployeeName("John Doe");
        employee.getEmployeeDetails();

        com.springcore.xml.ioc.Account account = applicationContext.getBean("account", com.springcore.xml.ioc.Account.class);
        account.setCustomerId(4);
        account.setCustomerName("Amit");
        account.getCustomerDetails();
    }
}
