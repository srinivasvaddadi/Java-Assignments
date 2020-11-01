package com.Assignment6;

import java.util.Scanner;

public class Common {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private int salary;
	private String designation;
	

	public void getDetails() {
		System.out.println("Enter name,age,salary,designation...");
		name = sc.next();
		age = sc.nextInt();
		salary = sc.nextInt();
		sc.nextLine();
		designation = sc.nextLine();
	}

	public void display() {
		System.out.print("Name-"+ name + "," +"Age-" + age + "," +"Salary-" +salary + "," +"Designation-" +designation);
	}

}
