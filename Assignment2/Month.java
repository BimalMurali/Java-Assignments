package com.assignment2.app;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the month in number format :");
		int month=input.nextInt();
		if(month==1 || month==2|| month==12) {
			System.out.println("Winter season");
		}
		else if(month==3||month==4||month==5) {
			System.out.println("Spring season");
		}
		else if(month==6||month==7||month==8) {
			System.out.println("Summer season");
		}
		else if(month==9|| month==10|| month==11) {
			System.out.println("Autumn season");
		}
		else {
			System.out.println("Invalid option");
		}


	}

}
