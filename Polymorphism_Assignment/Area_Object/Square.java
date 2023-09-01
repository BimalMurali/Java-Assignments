package Area_Object;

public class Square extends Shape {
	public int length;
	
	public Square(int length) {
		this.length=length;
	}

	public int area() {
		return length*length;
	}


}
