package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

   //Constructor injection
   /*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		 fortuneService =theFortuneService ;
  }*/
	
	public TennisCoach() {
		System.out.println("Inside default constructor..");
	}
	
	
   //Setter injection
   /* @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	public void doAnyThing(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice everyday 1hr and run for 30 mins.";
	}

	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
