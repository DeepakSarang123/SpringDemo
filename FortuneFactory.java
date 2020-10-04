package com.luv2code.demo;

import java.util.Random;

public class FortuneFactory implements FortuneService {

	@Override
	public String getFortune() {
		

		String[] myFortune = {"Namaste","Hi", "Hello",};
		Random rand = new Random();
		return myFortune[rand.nextInt(myFortune.length)];
	}

}
