package com.luv2code.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run for 30 mns daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach:inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach:inside method doMyCleanupStuffYoYo");
	}

}
