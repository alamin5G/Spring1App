package com.goonok.Spring1App.cons_inject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/goonok/Spring1App/cons_inject/beans.xml");
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
	}
}
