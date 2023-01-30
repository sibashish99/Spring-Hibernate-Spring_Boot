package com.spring.demo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    
    
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 1hr daily in tracking and running";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! "+fortuneService.getFortune();
	}

	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
    
	public void doMyWork() {
		System.out.println("This is my init method : doMyWork.");
	}
    
	public void doMyCleanup() {
		System.out.println("This is my destroy method :unDoMyWork ");
	}

}
