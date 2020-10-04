package com.luv2code.demo;

public class BaseballCoach implements Coach {
    
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practise for 30 mns daily";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune Service to get a fortune
		return fortuneService.getFortune();
	}
	
}
