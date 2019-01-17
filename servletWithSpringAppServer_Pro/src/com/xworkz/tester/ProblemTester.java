package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springComponent.Application;

public class ProblemTester {
public static void main(String[] args) {
	
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resource/context.xml");
		Application app =container.getBean(Application.class);
		System.out.println("********************");
		System.out.println("Number of bean object created"+container.getBeanDefinitionCount());
		
		  app.run();
		 
		
	}
}

