package com.demo.questions;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println("Enter the Number ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int result = factorial(num);
		System.out.println("Factorial of Number " + num + " is " + result);
		scn.close();

	}

	private static int factorial(int num) {

		if (num == 1 || num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}
