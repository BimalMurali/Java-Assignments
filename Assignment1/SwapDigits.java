package com.assignment.app;

public class SwapDigits {

	public static void main(String[] args) {
		int a=2,b=3;
		System.out.println("Before Swapping Values are :"+a+" ,"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping : "+a+", "+b);
		

	}

}
