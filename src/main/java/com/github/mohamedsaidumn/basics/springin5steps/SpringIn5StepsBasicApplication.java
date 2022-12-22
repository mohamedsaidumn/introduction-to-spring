package com.github.mohamedsaidumn.basics.springin5steps;

import com.github.mohamedsaidumn.basics.springin5steps.basic.BinarySearchImpl;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.springframework.context.annotation.ComponentScan;


//These are what we need to tell spring, inorder for it to manage our dependencies
//1) What are the beans?
//2) What are the dependencies of a bean?
//3) Where to search for beans? => No need (checks the package and everything in it by default)

@SpringBootApplication
public class SpringIn5StepsBasicApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);

    public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        ApplicationContext applicationContext =
                SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);

        int result =
                binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);
    }
}

