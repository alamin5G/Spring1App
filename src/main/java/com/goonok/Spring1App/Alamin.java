package com.goonok.Spring1App;

public class Alamin implements Action{

	@Override
	public void eat() {

		System.out.println("Mr. Aalmin eating food..");
		
	}

	@Override
	public void sleep() {
		System.out.println("Mr. Alamin will sleep 2 AM.");
		
	}

	@Override
	public void read() {

		System.out.println("Mr. Alamin daily read 20 pages of book");
		
	}

}
