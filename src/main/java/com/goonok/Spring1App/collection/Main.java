package com.goonok.Spring1App.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/goonok/Spring1App/collection/beans.xml");
		Student st = context.getBean("st1", Student.class);
		System.out.println(st);
	}

}
