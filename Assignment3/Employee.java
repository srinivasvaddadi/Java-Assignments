package com.Assignment3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Date of Birth: ");
		int date = sc.nextInt();
		System.out.println("Enter Month Number: ");
		int month = sc.nextInt();
		System.out.println("Enter Year of Birth: ");
		int year = sc.nextInt();
		System.out.println("Enter Monthly Salary: ");
		int monthlySalary = sc.nextInt();

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, date);
		Period p = Period.between(birthday, today);

		int annualSalary = monthlySalary * 12;
		int taxPercent = 0;
		if (annualSalary < 200000) {
			taxPercent = 0;
		} else if (annualSalary >= 200000 && annualSalary < 300000) {
			taxPercent = 10;
		} else if (annualSalary >= 300000 && annualSalary < 400000) {
			taxPercent = 20;
		} else if (annualSalary >= 400000 && annualSalary < 500000) {
			taxPercent = 25;
		} else if (annualSalary > 500000) {
			taxPercent = 30;
		}

		System.out.println("Your Name is : " + name);
		System.out.println("Your Age is: " + p.getYears());
		System.out.println("Your Annual Salary is :" + annualSalary);
		System.out.println("Your Tax Percentage is :" + taxPercent);

	}

}
