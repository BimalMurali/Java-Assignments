package com.assignment2.app;

import java.util.Scanner;

public class Month_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the month in number format :");
		int month=input.nextInt();
		switch(month) {
		case 1:
			System.out.println("Winter season");
			break;
		case 2:
			System.out.println("Winter season");
			break;

		case 12:
			System.out.println("Winter season");
			break;

		case 3:
			System.out.println("Spring season");
			break;

		case 4:
			System.out.println("Spring season");
			break;

		case 5:
			System.out.println("Spring season");
			break;

		case 6:
			System.out.println("Summer season");
			break;

		case 7:
			System.out.println("Summer season");
			break;

		case 8:
			System.out.println("Summer season");
			break;

		case 9:
			System.out.println("Summer season");
			break;

		case 10:
			System.out.println("Summer season");
			break;

		case 11:
			System.out.println("Summer season");
			break;

		default:
			System.out.println("Invalid option");
			break;

		}


	}

}
