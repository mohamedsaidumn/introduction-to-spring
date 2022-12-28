package com.github.mohamedsaidumn.basics.springin5steps.basic;

import com.github.mohamedsaidumn.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.ContextConfiguration;


import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)

//load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchImplTest {

    //get the bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario(){
        //call the method on binary search
        //check if the method is correct
        int actualResult = binarySearch.binarySearch( new int[]{}, 5);
        assertEquals(3,actualResult);

    }


}
