package com.spring.annotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class DailyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "This is Daily Fortune Service Class";
	}

}
