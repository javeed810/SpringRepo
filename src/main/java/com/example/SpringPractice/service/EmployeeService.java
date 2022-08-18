package com.example.SpringPractice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringPractice.entity.Employee;
import com.example.SpringPractice.repo.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo repo;
	static List<Employee> ll=new ArrayList<Employee>();
	
	public static List<Employee> listEmp(){
		ll.add(new Employee("javeed", 1001, 20000, "CSE", "ajalapur,karnataka"));
		ll.add(new Employee("lalaman", 1002, 20000, "CSE", "UP"));
		ll.add(new Employee("venkat", 1003, 20000, "CSE", "AP"));
		ll.add(new Employee("ashutosh", 1004, 20000, "CSE", "MH"));
		return ll;
		
	}
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	public String saveEmp(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
		return "Employee is added successfully";
	}

}
