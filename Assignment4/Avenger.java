package com.Assignment4;

import java.util.Scanner;

public class Avenger {
	Scanner sc = new Scanner(System.in);
	private String name,power,weapon,planet;
	private int age;
	
	public void getDetails() {
		System.out.println("Enter Name,Age,Power,Weapon,Planet");
		name = sc.next();
		age = sc.nextInt();
		power = sc.next();
		weapon = sc.next();
		planet = sc.next();
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Power: "+power);
		System.out.println("Weapon: "+weapon);
		System.out.println("Planet: "+planet);
	}
}
