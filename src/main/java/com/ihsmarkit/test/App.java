package com.ihsmarkit.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SimpleService simpleService = (SimpleService) context.getBean("simpleServiceBean");
		int i = 0;
		while (true) {
			System.out.println("Sum: " + simpleService.calculate(i++, i++));
			Thread.sleep(1000L);
		}
	}

}
