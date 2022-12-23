package com.github.mohamedsaidumn.basics.springin5steps;

import com.github.mohamedsaidumn.basics.springin5steps.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringIn5StepsPropertiesApplication.class)) {
            SomeExternalService service =
                    applicationContext.getBean(SomeExternalService.class);
            System.out.println(service);
        }

    }
}
