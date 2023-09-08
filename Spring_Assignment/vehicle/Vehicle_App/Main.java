package Vehicle_App;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Vehicle_Service.Vehicle;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ClassPathXmlApplicationContext iVehicle=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Vehicle veh_honda =iVehicle.getBean("vehicle_honda",Vehicle.class);
		Vehicle veh_tata =iVehicle.getBean("vehicle_tata",Vehicle.class);
        do {
		System.out.println("Enter the option: ");
		System.out.println("1.for Honda 2. for Tata 3 for Exit");
		int choice=scan.nextInt();
		if(choice ==1) {
			System.out.println("Vehicle name is "+veh_honda.getVehicleName());
			System.out.println("Brand name is "+veh_honda.getBrandName());
		}
		else if(choice==2) {
			System.out.println("Vehicle name is "+veh_tata.getVehicleName());
			System.out.println("Brand name is "+veh_tata.getBrandName());
		}
		else if(choice==3){ 
			System.exit(0);
		}
		else {
			System.out.println("Invalid Option");
		}
		
	} while(true);
}
}
