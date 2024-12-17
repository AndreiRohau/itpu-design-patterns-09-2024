package com.arohau.strategy.ex1;

public class Social implements ShareStrategy {
	@Override
	public void share() {
		System.out.println("I'm posting the photo on social media");
	}
}
