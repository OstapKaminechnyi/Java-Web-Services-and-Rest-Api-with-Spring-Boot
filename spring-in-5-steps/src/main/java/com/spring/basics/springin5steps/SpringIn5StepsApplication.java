package com.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
    //beans

	public static void main(String[] args) {
       // BinarySearchImpl binarySearch =
         //       new BinarySearchImpl(new BubbleSortAlgorithm());
        //Application context


		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[] {12,4,6},3);

        System.out.println(result);
	}

}

