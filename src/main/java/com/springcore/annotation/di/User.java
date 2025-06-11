package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class User {
    @Autowired
//    @Qualifier("laptopProcessor")
    private SmartphoneProcessor processor;


    public void start(){
        log.info("THE DEVICE IS STARTING!");
        processor.process();
    }
}
