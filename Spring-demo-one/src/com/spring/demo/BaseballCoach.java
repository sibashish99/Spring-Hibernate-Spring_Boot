package com.spring.demo;

public class BaseballCoach implements Coach{
	
  //define private filed for DI
  private FortuneService fortuneService;
  
  //define a constructor for DI
  public BaseballCoach(FortuneService theFortuneService) {
	  fortuneService=theFortuneService;
  }
  
  @Override	
  public String getDailyWorkout() {
	  return "Spend 30 mins in batting practice";
			  
  }

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
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

  
}
