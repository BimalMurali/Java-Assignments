package com.assignment2.app;

import java.util.Scanner;

public class Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int y=1234;
		System.out.println("Enter the pin : ");
		int pin=input.nextInt();
		if(pin==y) {
			System.out.println("Access Granted ");
		}
		else {
			System.out.println("Access Denied ");
		}
		

	}

}
