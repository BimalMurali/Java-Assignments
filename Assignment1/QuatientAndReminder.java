package com.assignment.app;

import java.util.Scanner;

public class QuatientAndReminder {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double a,b;
		System.out.println("Enter first number :");
		a=input.nextDouble();
		System.out.println("Enter second number :");
		b=input.nextDouble();
		int quotient=(int) (a/b);
		System.out.println("Quotient is : "+quotient);
		System.out.println("Reminder is : "+a%b);


	}

}
