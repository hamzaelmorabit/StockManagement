package com.luv2code.springdmo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleMainSpringDemo {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle_applicationContext.xml");
		
		TrackCoach coach = context.getBean("myCoach", TrackCoach.class);
		
		
		context.close();
	}
}
