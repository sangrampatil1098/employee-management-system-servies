package com.employeemanagement.springboot;

import com.employeemanagement.springboot.model.Employee;
import com.employeemanagement.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Yuvraj");
//		employee1.setLastName("Singh");
//		employee1.setEmailId("yuvraj@Gmail.com");
//		employeeRepository.save(employee1);
//
//		Employee employee2 = new Employee();
//		employee2.setFirstName("Mahendra Singh");
//		employee2.setLastName("Dhoni");
//		employee2.setEmailId("ms@gmail.com");
//		employeeRepository.save(employee2);
	}
}
