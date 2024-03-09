package com.demo4;

import javax.sound.midi.SysexMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Logical operator with spEL
		ApplicationContext ctx = new ClassPathXmlApplicationContext("demo4.xml");

		EmailValidator emailValidator = ctx.getBean("emailValidator", EmailValidator.class);

		System.out.println(emailValidator.getIsValidEmail());
		

	}
}
