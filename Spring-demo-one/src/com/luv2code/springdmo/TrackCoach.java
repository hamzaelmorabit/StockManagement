package com.luv2code.springdmo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach , DisposableBean{

	private FortineService fortineService;
	private String emailAddress;

	public TrackCoach() {
		System.out.println("There is no arg-constructor method");

	}

//	public TrackCoach(FortineService= fourtineService_;) {
//		System.out.println("constructor method");
//		//fortineService = fourtineService_;
//	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Run a hard 5km ";
	}

	public FortineService getFortineService() {
		return fortineService;
	}

	public void setFortineService(FortineService fortineService) {
		System.out.println("set FortineService method");
		this.fortineService = fortineService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println(emailAddress);
		this.emailAddress = emailAddress;
	}

	@Override
	public String getFourtine() {
		if (fortineService != null)
			return "just Do it " + fortineService.getFourtine();
		return "fortineService is null for TrackCoach in method getFortine";
	}

	
	
	public  void cleanApplication() {
		System.out.println("cleanApplication method");
	}
	
	public void startUpApplication() {
		System.out.println("statrUpApplication method");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cleanApplication method !!");
	}
}
