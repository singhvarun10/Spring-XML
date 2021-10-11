package com.varun.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		
		boolean result = theCoach==theCoach2;
		// scope = singelton -> will use same object everywhere
		// scope = prototype -> will create different each time when we call the context.getBean
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(theCoach2);
	}
}
