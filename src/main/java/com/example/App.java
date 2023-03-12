package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
	public static void main(String[] args) {
		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		// Get the bean
		Sim sim = applicationContext.getBean("sim", Sim.class);
		
		// Calling the methods
		sim.calling();
		sim.data();
	}
}
