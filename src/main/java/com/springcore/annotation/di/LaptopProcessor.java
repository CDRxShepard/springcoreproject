package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class LaptopProcessor implements Processor{
    @Override
    public void process() {

       log.info("Laptop processor is starting!");
    }
}
