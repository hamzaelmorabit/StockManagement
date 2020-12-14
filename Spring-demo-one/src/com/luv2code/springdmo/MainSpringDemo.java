package com.luv2code.springdmo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringDemo {

	public static void main(String[] args) {

		// **************************************
//		// load the spring configuration file
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		// Retrieve bean from spring
//		Coach coach = context.getBean("myCoach", Coach.class);
//
//		// Call the methods on the bean
//		System.out.println(coach.getDailyWork());
//
//		// Close the context
//		context.close();

		// **************************************
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring
		TrackCoach coach = context.getBean("myCoach", TrackCoach.class);

		// Call the methods on the bean
		System.out.println(coach.getFourtine());
		System.out.println(coach.getEmailAddress());
		// Close the context
		context.close();

	}

}
