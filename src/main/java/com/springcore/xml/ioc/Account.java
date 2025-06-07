package com.springcore.xml.ioc;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Account {
    private int customerId;
    private String customerName;

    public void getCustomerDetails() {
        log.info("Employee ID: " + customerId);
        log.info("Employee Name: " + customerName);
    }
}
