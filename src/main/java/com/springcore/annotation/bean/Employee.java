package com.springcore.annotation.bean;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Setter
@Component
public class Employee {
    private int employeeId;
    private String employeeName;

    public void getEmployeeDetails(){
        log.info("Employee Details");
        log.info("Employee ID : {} and Employee Name : {}",employeeId, employeeName);
    }
}
