package com.luv2code.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the Spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from Spring Container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        
        Coach alphaCoach = context.getBean("myCoach",Coach.class);
        
        //check if they are same
        boolean result = (theCoach==alphaCoach);
        
        System.out.println("\nPointing to same object:"+result);
        
        System.out.println("\nMemory location for theCoach:"+theCoach);
        
        System.out.println("\nMemory location for alphaCoach:"+alphaCoach+"\n");
	}

}
