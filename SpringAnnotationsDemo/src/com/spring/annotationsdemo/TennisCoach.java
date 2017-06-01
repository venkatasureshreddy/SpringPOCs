package com.spring.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
/* AutoWire ---> auto wire is injecting components to the fields ...with out object creation.
 * 
 * This is field injection with auto wired
	@Autowired
	private FortuneService fortuneService;
	

	// This is constructor injection with Autowired
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
	super();
	this.fortuneService = fortuneService;
}
*/
	// This is setter injectioon with autowited
	private FortuneService fortuneService;
	@Autowired
	public void setFortuneservice(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Practise Tennis Daily";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
