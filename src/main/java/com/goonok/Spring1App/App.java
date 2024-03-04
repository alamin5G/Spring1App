package com.goonok.Spring1App;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/goonok/Spring1App/beans.xml");
    	Student st = context.getBean("st2", Student.class);    	
    	System.out.println(st);
    	
    	
    	
    }
}
