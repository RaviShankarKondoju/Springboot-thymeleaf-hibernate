package com.myapp.springboot.thymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.springboot.thymeleaf.entity.Employee;

// Employee class is based on integer primary key so pass Integer

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// that's it... no need to write any code LOL!
	
	// add a method to sort by last name

	public List<Employee> findAllByOrderByLastNameAsc();
	

}
