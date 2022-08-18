package com.example.SpringPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringPractice.entity.Employee;
import com.example.SpringPractice.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/All")
	public List<Employee> getEmployee() {
		return service.getAllEmployee();
	}
	
	@PostMapping("/save")
	public String addEmp(@RequestBody Employee emp) {
		return service.saveEmp(emp);
	}

}
