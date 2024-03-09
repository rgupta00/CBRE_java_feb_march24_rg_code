package com.demo3;

import javax.sound.midi.SysexMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Logical operator with spEL
		ApplicationContext context=
				new ClassPathXmlApplicationContext("demo3.xml");
		
		ExaminationResult examinationResult=
				context.getBean("result", ExaminationResult.class);
		System.out.println(examinationResult);
	}
}
