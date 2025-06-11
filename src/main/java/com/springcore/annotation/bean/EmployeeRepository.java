package com.springcore.annotation.bean;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class EmployeeRepository {

    public String getEmployeeName() {
        log.info("Fetching employee name");
        return "Amit";
    }
}

