package com.learning.springbegning;

public class BaseballCoach implements Coach {

	FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}
	

	public BaseballCoach() {
		super();
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Pratcise daily with baseball try to hit long shots";
	}
	

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
