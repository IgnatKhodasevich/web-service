package org.example.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class WebServiceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(WebServiceApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int [] {12,12,3,}, 3);
		System.out.println(result);

	}
}
