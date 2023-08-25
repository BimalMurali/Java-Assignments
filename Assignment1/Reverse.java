package com.assignment.app;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the  digit: ");
		int digit=input.nextInt();
		int rev=0,rem;
		while(digit>0) {
			rem=digit%10;
			rev=rem+rev*10;
			digit=digit/10;
		}
System.out.println("Reverse number is : "+rev);
	}

}
