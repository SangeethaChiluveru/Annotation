package com.cg.emp;

import org.springframework.context.annotation.Bean;

public class EmployeeConfig {
	
	@Bean
	public Employee getEmp() {
		return new Employee();
	}

}
