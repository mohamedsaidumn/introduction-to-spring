package com.github.mohamedsaidumn.basics.springin5steps.basic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BinarySearchImpl {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Qualifier("quick")
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }

    @PostConstruct
    public void PostConstruct(){
        logger.info("PostConstruct");
    }

    @PreDestroy
    public void PreDestroy(){
        logger.info("PreDestroy");
    }

}