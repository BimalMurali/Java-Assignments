package Animal;

import java.util.Scanner;

public class Test {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnimals obj = new MyAnimals();
		System.out.println("Enter the temperature");
		obj.setBodyTemp(sc.nextInt());
		System.out.println(obj.GetBodyTemp());

	}

}
