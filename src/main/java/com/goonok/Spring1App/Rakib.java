package com.goonok.Spring1App;

public class Rakib implements Action{

	@Override
	public void eat() {

		System.out.println("Mr. Rakib eating food..");
		
	}

	@Override
	public void sleep() {
		System.out.println("Mr. Rakib will sleep 2 AM.");
		
	}

	@Override
	public void read() {

		System.out.println("Mr. Rakib daily read 20 pages of book");
		
	}

}
