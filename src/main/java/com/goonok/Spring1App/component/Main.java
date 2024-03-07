package com.goonok.Spring1App.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("com/goonok/Spring1App/component/beans.xml");
		Employee em = contex.getBean("employee", Employee.class);
		
		System.out.println(em);

	}

}
