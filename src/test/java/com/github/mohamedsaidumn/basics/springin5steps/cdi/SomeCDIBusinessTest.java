package com.github.mohamedsaidumn.basics.springin5steps.cdi;

import com.github.mohamedsaidumn.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class SomeCDIBusinessTest {
    //Create a mock
    @Mock
    SomeCDIDAO daoMock;

    //inject mock
    @InjectMocks
    SomeCDIBusiness someCDIBusiness;


    @Test
    void testBasicScenario() {
        //when daoMock.getData() method is called return int[] {2,4}
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
        int actualResult = someCDIBusiness.findGreatest();
        assertEquals(4,actualResult);

    }

    @Test
    void testBasicScenario2() {
        //when daoMock.getData() method is called return int[] {2,4}
        Mockito.when(daoMock.getData()).thenReturn(new int[] {});
        int actualResult = someCDIBusiness.findGreatest();
        assertEquals(Integer.MIN_VALUE,actualResult);

    }

}
