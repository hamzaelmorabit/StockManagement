package com.luv2code.springdmo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanMainSpringDemo {
	public static void main(String[] args) {

		// load the spring configuration from file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_applicationContext.xml");

		// retrieve the bean from spring
		TrackCoach coachTrack = context.getBean("myCoach", TrackCoach.class);

		// retrieve the bean from spring
		TrackCoach coachTrack2 = context.getBean("myCoach", TrackCoach.class);

		// If We have the scope prototype dosn't the same
		System.out.println(coachTrack == coachTrack2);
		System.out.println(coachTrack + " coachTrack");
		System.out.println(coachTrack2 + " coachTrack2");
		
		context.close();
	}
}
