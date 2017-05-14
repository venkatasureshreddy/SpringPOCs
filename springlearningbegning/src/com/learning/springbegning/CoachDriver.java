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
		// context.close();

		// COnstructor Injection

		Coach coach2 = context.getBean("ConInjection", Coach.class);
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach2.getFortuneService());

		// Setter Injection

		Coach coach3 = context.getBean("BeanInjection", Coach.class);
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach3.getFortuneService());

		// Literal Injection
		BaseballCoach baseBallCoach = context.getBean("literalInjection", BaseballCoach.class);
		System.out.println(baseBallCoach.getEmail());
		System.out.println(baseBallCoach.getTeam());
		
		//PropertiesfileLiterals
		BaseballCoach baseBallCoach1 = context.getBean("propertiesFileInjection", BaseballCoach.class);
		System.out.println(baseBallCoach1.getEmail());
		System.out.println(baseBallCoach1.getTeam());
		context.close();
		
		//Scope-Singleton,prototype
		
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationcontext-scope.xml");
		FortuneService service = context1.getBean("scoperef",FortuneService.class);
		FortuneService service1 = context1.getBean("scoperef",FortuneService.class);
		System.out.println(service);
		System.out.println(service1);
		
		context1.close();

	}

}
