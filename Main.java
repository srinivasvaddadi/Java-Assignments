package com.Assignment7;

public class Main{

	public static void main(String[] args) {
		
		DoctorType[] doc = new DoctorType[3];
		EngineerType[] eng = new EngineerType[3];
		PilotType[] plt = new PilotType[3];
		
		System.out.println("Doctors");
		for(int i=0;i<3;i++) {
			doc[i] = new DoctorType();
			doc[i].getDetails();
			doc[i].display();
			doc[i].designation();
			doc[i].specialization();
		}
		
		System.out.println();
		System.out.println("Engineers");
		for(int i=0;i<3;i++) {
			eng[i] = new EngineerType();
			eng[i].getDetails();
			eng[i].display();
			eng[i].designation();
			eng[i].specialization();
		}
		
		System.out.println();
		System.out.println("Pilots");
		for(int i=0;i<3;i++) {
			plt[i] = new PilotType();
			plt[i].getDetails();
			plt[i].display();
			plt[i].designation();
			plt[i].specialization();
		}

	}

}
