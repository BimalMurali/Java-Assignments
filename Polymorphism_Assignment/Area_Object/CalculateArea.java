package Area_Object;

public class CalculateArea {
	public static void calculateArea(Shape obj) {
		System.out.println("area is "+obj.area());
		
	}


	public static void main(String[] args) {
		Rectangle rc = new Rectangle(2,4);
		Square sc= new Square(2);
		calculateArea(rc);
		calculateArea(sc);
		
	}
				

}
