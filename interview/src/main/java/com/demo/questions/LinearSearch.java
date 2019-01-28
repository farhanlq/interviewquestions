package com.demo.questions;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements ");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements !!!");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the number to be searched for ");
		int searchNumber = scn.nextInt();
		int position = search(arr, searchNumber);
		System.out.println(position > 0 ? "The element is present at the location " + position + " "
				: "The element is not present in the array ");
		scn.close();
	}

	private static int search(int[] arr, int searchNumber) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchNumber)
				return (i + 1);
		}
		return -1;
	}
}
