package com.Assignment7;

import java.util.Scanner;

public class Common {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private int salary;

	public void getDetails() {
		System.out.println("Enter name,age,salary...");
		name = sc.next();
		age = sc.nextInt();
		salary = sc.nextInt();
	}

	public void display() {
		System.out.println("Name- "+name);
		System.out.println("Age- "+age);
		System.out.println("Salary- "+salary);
	}

	public void designation() {

	}

	public void specialization() {

	}

}
