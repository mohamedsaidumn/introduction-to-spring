package com.github.mohamedsaidumn.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.github.mohamedsaidumn.basics.componentscan.ComponentDAO;

//@Configuration
@ComponentScan("com.github.mohamedsaidumn.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsComponentScanApplication.class)) {
            ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

            LOGGER.info("{}", componentDAO);
        }
    }
}
