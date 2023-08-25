package com.assignment.app;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the five digits: ");
		int digit=input.nextInt();
		int sum=0,rem;
		while(digit>0) {
			rem=digit%10;
			sum=sum+rem;
			digit=digit/10;
		}
System.out.println("Sum of the digits is :"+sum);

	}

}
