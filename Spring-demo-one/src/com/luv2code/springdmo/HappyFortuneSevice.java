package com.luv2code.springdmo;

import java.util.Random;

public class HappyFortuneSevice implements FortineService {
	private final String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };
	private Random r = new Random();

	@Override
	public String getFourtine() {

		int random = r.nextInt(data.length);
		return data[random];
	}

}
