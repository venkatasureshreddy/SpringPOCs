package com.learning.springbegning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create Application by loding spring configfile
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get Bean from container
		Coach coach = context.getBean("myBaseBallCoach", Coach.class);

		// read methods
		System.out.println(coach.getDailyFortune());
		
		

		// get Bean from container
		Coach coach1 = context.getBean("myTennisCoach", Coach.class);

		// read methods
		System.out.println(coach1.getDailyFortune());
		// close context
		//context.close();
		
		//COnstructor Injection
		
		Coach coach2 = context.getBean("ConInjection",Coach.class);
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach2.getFortuneService());
		
		//Setter Injection
		
		Coach coach3 = context.getBean("BeanInjection",Coach.class);
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach3.getFortuneService());
		context.close();
		

	}

}
