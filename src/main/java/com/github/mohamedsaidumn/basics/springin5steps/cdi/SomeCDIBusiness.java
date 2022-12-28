package com.github.mohamedsaidumn.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
    @Inject
    private SomeCDIDAO someDao;



    public void setSomeDao(SomeCDIDAO someDao) {
        this.someDao = someDao;
    }

    public SomeCDIDAO getSomeDao() {
        return someDao;
    }

    public int findGreatest() {
        int greatest= Integer.MIN_VALUE;
        int [] data = someDao.getData();

        for(int value : data)
        {
            if (value > greatest){
                greatest = value;
            }
        }

        return  greatest;

    }
}
