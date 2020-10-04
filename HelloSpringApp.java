package com.luv2code.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	

	public static void main(String[] args) {

		//Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from Spring Container
		Coach theCoach = context.getBean("myKabaddiCoach",Coach.class);		
		//call methods on the bean
        System.out.println(theCoach.getDailyWorkout());		
        
        //let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());
		//close the context
        context.close();
	}

}
