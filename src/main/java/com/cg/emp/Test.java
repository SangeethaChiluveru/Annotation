package com.cg.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ob=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee e=ob.getBean(Employee.class);
		e.setId(101);
		e.setName("reena");
		System.out.println(e);

	}

}
