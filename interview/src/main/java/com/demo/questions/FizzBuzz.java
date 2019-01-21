package com.demo.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		List<String> result = fizzBuzz(num);
		result.forEach(System.out::println);

	}

	public static List<String> fizzBuzz(int n) {
		final List<String> al = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				al.add("FizzBuzz");
			} else if (i % 5 == 0) {
				al.add("Fizz");
			} else if (i % 3 == 0) {
				al.add("Buzz");
			} else {
				al.add(Integer.toString(i));
			}
		}
		return al;
	}
}
