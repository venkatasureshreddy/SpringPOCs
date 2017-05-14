package com.learning.springbegning;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "your fortune was very good today";
	}
	
	public String testInit(){
		System.out.println("init methid excuted");
		return "";
	}
	public String testDestroy(){
		System.out.println("Destroy methid excuted");
		return "";
	}
	
	
	

}
