package com.luv2code.demo;

public class KabaddiCoach implements Coach {

	//define dependency fields
	private FortuneFactory fortuneFactory;
	
	
	public KabaddiCoach(FortuneFactory fortuneFactory) {
		
		this.fortuneFactory = fortuneFactory;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise 100 plunges a day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneFactory.getFortune();
	}

}
