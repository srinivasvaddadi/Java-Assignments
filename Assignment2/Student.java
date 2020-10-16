package com.Assignment2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Each Subject Max Marks = 100 ");
		System.out.println("Enter 5 Subject Marks : ");
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		int avg = sum / 5;
		System.out.println("Percentage is:" + avg);
		if (avg >= 75 && avg < 100) {
			System.out.println("Grade A");
		} else if (avg >= 60 && avg < 75) {
			System.out.println("Grade B");
		} else if (avg >= 35 && avg < 60) {
			System.out.println("Grade c");
		} else {
			System.out.println("You Failed!");
		}
	}
}
