package com.luv2code.springdmo;

public class BaseballCoach implements Coach {

	public BaseballCoach() {

	}

	// define a private field for the dependency
	private FortineService fourtineService;

	// define a construtor for dependency injection
	public BaseballCoach(FortineService fourtineService_) {
		fourtineService = fourtineService_;
	}

	@Override
	public String getDailyWork() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getFourtine() {
		// use my fourtineService to get a fourtine
		if (fourtineService != null)
			return fourtineService.getFourtine();
		return "foutineService is null ";
	}

}
