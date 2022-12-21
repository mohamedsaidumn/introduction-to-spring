package com.github.mohamedsaidumn.basic.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	//These are what we need to tell spring, inorder for it to manage our dependencies
	//1) What are the beans?
	//2) What are the dependencies of a bean?
	//3) Where to search for beans? => No need (checks the package and everything in it by default)

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch1 =
				applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 =
				applicationContext.getBean(BinarySearchImpl.class);
		int result =
				binarySearch1.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(binarySearch1);
		System.out.println(binarySearch2);

	}
}