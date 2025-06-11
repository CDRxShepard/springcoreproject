package com.springcore.annotation.bean;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public void showEmployeeDetails() {

        String employee = employeeRepository.getEmployeeName();
        System.out.println("Employee ID: ");
        System.out.println("Employee Name: ");
    }
}
