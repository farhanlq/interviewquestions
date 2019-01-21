package com.demo.questions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner scn = new Scanner(System.in);
		String text = scn.nextLine();
		String reverseText = reverse(text);
		System.out.println(reverseText);
		scn.close();

	}

	private static String reverse(String text) {
		StringBuilder sb = new StringBuilder(text.length());
		for (int i = text.length() - 1; i >= 0; i--) {
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}

}
