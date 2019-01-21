package com.demo.questions;

import java.util.Scanner;

public class FactorialIterative {

	public static void main(String[] args) {
		System.out.println("Enter the Number ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int result = factorial(num);
		System.out.println("Factorial of Number " + num + " is " + result);
		scn.close();

	}

	private static int factorial(int num) {
		int output = 1;
		for (int i = 1; i <= num; i++) {
			output = output * i;
		}
		return output;
	}
}
