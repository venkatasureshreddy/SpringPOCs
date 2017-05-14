package com.learning.springbegning;

public class BaseballCoach implements Coach {
	private String email;
	private String team;
	FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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
