package Area_Object;

public class Rectangle extends Shape{
	public int length;
	public int width;
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}

	public int area() {
		return length*width;
	}


}
