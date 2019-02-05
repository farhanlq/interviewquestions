package com.demo.questions;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o2.getSalary() > o1.getSalary())
			return 1;
		else if (o2.getSalary() < o1.getSalary())
			return -1;
		else
			return 0;
	}

}
