package com.assignment2.app;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("1.for Domestic and 2. for Industry ");
		int choice =input.nextInt();
		if (choice==1) {
			System.out.println("Enter the number of units : ");
			int unit=input.nextInt();
			if (unit<=100) {
				System.out.println("Bill amount is :"+unit);
			}
			else if(unit>100 && unit<=200) {
				System.out.println("Bill amount is "+unit*1.5);
			}
			else if(unit>200 && unit<=500) {
				System.out.println("Bill amount is "+unit*2);
			}
			else if(unit>500) {
				System.out.println("Bill amount is "+unit*5);
			}
		}
		else if(choice==2) {
			System.out.println("Enter the units: ");
			int unit=input.nextInt();
			System.out.println("Bill amount is :"+unit*10);

		}
		else {
			System.out.println("Ivalid option");
		}

	}

}
