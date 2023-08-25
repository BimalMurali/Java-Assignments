package com.assignment.app;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the distance");
		int dist=input.nextInt();
		System.out.println("Distance in meter is "+dist*1000);
		System.out.println("Distance in feet is "+dist*3280.8399);
		System.out.println("Distance in inch is "+dist*39370.0787);
		System.out.println("Distance in centimeter is "+dist*10000);




	}

}
