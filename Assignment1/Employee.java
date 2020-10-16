package com.Assignment1;

public class Employee {
	private String name;
	private int age;
	private String city;

	public void display(String name, int age, String city) {
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("City is : " + city);

	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.display("Srinivas", 20, "Hyderabad");
		System.out.println();
		e2.display("Dhoni", 33, "Ranchi");

	}
}
