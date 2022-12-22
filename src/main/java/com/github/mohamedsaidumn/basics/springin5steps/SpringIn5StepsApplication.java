package com.github.mohamedsaidumn.basics.springin5steps;

import com.github.mohamedsaidumn.basics.springin5steps.basic.BinarySearchImpl;
import com.github.mohamedsaidumn.basics.springin5steps.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;


//These are what we need to tell spring, inorder for it to manage our dependencies
//1) What are the beans?
//2) What are the dependencies of a bean?
//3) Where to search for beans? => No need (checks the package and everything in it by default)

@SpringBootApplication
public class SpringIn5StepsApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		PersonDAO personDAO1 =
				applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 =
				applicationContext.getBean(PersonDAO.class);


		logger.info("{}", personDAO1);
        logger.info("{}", personDAO1);
        logger.info("{}", personDAO1.getJdbcConnection());
        logger.info("{}", personDAO1.getJdbcConnection());





	}
}