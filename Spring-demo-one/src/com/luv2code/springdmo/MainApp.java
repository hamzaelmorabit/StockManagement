package com.luv2code.springdmo;

import java.util.Random;

public class MainApp {
	public static void main(String[] args) {
		Random r = new Random();
		//	forMath.floor(r.nextInt()*2);
		for (int i = 0; i < 22; i++) {
			System.out.println((r.nextInt(5)));
		}
		//Coach objBaseball = new BaseballCoach();
		//System.out.println(objBaseball.getDailyWork());

//		Coach objTrackCoach = new TrackCoach ();
//		System.out.println(objTrackCoach.getDailyWork());

	}
}