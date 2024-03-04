package com.goonok.Spring1App.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/goonok/Spring1App/ref/beans.xml");
		Student st = context.getBean("student",Student.class) ;
		System.out.println(st);
		
	}

}
