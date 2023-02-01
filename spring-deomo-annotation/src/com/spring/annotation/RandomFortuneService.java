package com.spring.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    
	private String[] data= {
			"Best of luck at your race tomorrow! ...",
			"Good luck today! ...",
			"Good luck and good wishes.",
			"All the luck in the world, all wished for you.",
			"Good luck, you! ...",
			"Love and luck to you on your first day at work. ...",
			"Sending good vibes to take with you to your treatment.",
			"I know how important this is for you."
	};
	private Random myRandomNo= new Random();
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		int index=myRandomNo.nextInt(data.length);
		String theService=data[index];
		return theService;
	}

}
