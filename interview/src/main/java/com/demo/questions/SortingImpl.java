package com.demo.questions;

import java.util.ArrayList;
import java.util.Collections;

public class SortingImpl {
	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(3, "xavient", 12, 34000));
		empList.add(new Employee(2, "fiserv", 23, 34151));
		empList.add(new Employee(5, "optum", 25, 23451));
		empList.add(new Employee(1, "pinelabs", 31, 12351));
		empList.add(new Employee(4, "telus", 41, 43215));
		Collections.sort(empList);
		System.out.println("Sorting using Comparable ");
		empList.forEach(System.out::println);

		System.out.println("---------------------------------");
		System.out.println("Sortin using Age Comparator in Ascending Order ");
		Collections.sort(empList, new AgeComparator());
		empList.forEach(System.out::println);

		System.out.println("---------------------------------");
		System.out.println("Sortin using Salary Comparator in Descending Order ");
		Collections.sort(empList, new SalaryComparator());
		empList.forEach(System.out::println);

	}
}
