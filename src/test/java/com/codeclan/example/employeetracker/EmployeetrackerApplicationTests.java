package com.codeclan.example.employeetracker;

import com.codeclan.example.employeetracker.models.Employee;
import com.codeclan.example.employeetracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeetrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployees(){
		Employee paulMackay = new Employee("Paul Mackay", 35, 13, "paul@mail.com");
		Employee andrewSmirthwaite = new Employee("Andrew Smirthwaite", 28, 9, "roo@mail.com");
		Employee colinMackay = new Employee("Colin Angus Mackay", 45, 42, "cam@mail.com");
		Employee robMathews = new Employee("Rob Mathews", 36, 17, "rob@mail.com");
		employeeRepository.save(paulMackay);
		employeeRepository.save(andrewSmirthwaite);
		employeeRepository.save(colinMackay);
		employeeRepository.save(robMathews);
	}

}
