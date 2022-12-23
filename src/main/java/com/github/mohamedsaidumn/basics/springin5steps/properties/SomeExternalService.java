package com.github.mohamedsaidumn.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    public String url;

    public String returnServiceURL(){
        return url;
    }
}
