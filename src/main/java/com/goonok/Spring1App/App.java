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
    	Action action = context.getBean("action", Action.class);
    	action.eat();
    	action.read();
    	action.sleep();
    	
    	
    	
    	
    	
    }
}
