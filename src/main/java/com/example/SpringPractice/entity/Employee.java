package com.example.SpringPractice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="employee")
public class Employee {
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private float salary;
	private String branch;
	private String address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, float salary, String branch, String address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.branch = branch;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public float getSalary() {
		return salary;
	}
	public String getBranch() {
		return branch;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", branch=" + branch + ", address="
				+ address + "]";
	}
	
	
}
