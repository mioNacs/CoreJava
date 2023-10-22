package com.internshala.javaapp;

import java.util.Scanner;

public class id_card {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter student's name: ");
		String name = inp.nextLine();

		System.out.print("Enter student's age: ");
		int age = inp.nextInt();

		System.out.print("Enter student's blood group: ");
		String blood = inp.next();

		String group;
		if (age >= 20) {
			group = "RED";
		} else if (age >= 15) {
			group = "BLUE";
		} else if (age >= 10) {
			group = "YELLOW";
		} else {
			System.out.println("enter age greater than or equal to 10.");
			return;
		}

		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println(" Name: " + name);
		System.out.println(" Age: " + age);
		System.out.println(" Blood Group: " + blood);
		System.out.println("-------------------------------------------");
		System.out.println("   Your group is " + group);
		System.out.println("-------------------------------------------");
	}
}