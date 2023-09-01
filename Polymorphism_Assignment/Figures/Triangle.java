package Figures;

public class Triangle extends Figure {

	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	public int area() {
		return dim1*dim2/2;
	}

}
