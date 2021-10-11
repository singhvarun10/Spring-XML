package com.varun.coach;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("startup method");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("cleanup method");
	}

}
