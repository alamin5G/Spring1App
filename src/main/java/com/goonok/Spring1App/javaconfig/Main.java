package com.goonok.Spring1App.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
