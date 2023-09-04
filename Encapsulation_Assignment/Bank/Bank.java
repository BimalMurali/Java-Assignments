package Bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your type of account:");
		System.out.println("1.Fixed 2.Savings");
		int ch = scan.nextInt();
		Customer obj = new Customer();
		System.out.println("Enter the principal amount :");
		obj.setPrincipal(Double.parseDouble(scan.next()));
		System.out.println("Enter the time:");
		obj.setTime(Integer.parseInt(scan.next()));
		if(ch==1)
		{
			obj.setRate(11);
		}
		else
		{
			obj.setRate(4);
		}
		
		obj.calculateInterest();
		
		

	}
}