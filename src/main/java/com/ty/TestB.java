package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new 
				ClassPathXmlApplicationContext("my_conf.xml");
		Teacher teacher = (Teacher) configurableApplicationContext.getBean("myTeacher");
		teacher.printDetails();;
	}

}
