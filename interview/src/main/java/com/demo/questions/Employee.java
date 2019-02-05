package com.demo.questions;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private int age;
	private float salary;

	
	
	public Employee(int empId, String empName, int age, float salary) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}

	public float getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return o.getEmpName().compareTo(this.getEmpName());
	}

}
