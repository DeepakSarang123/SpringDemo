package com.luv2code.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the Spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from Spring Container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        
       System.out.println(theCoach.getDailyWorkout());
        
        //close the context
        context.close();
	}

}
