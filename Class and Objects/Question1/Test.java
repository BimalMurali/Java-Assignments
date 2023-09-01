package Question1;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=new Box();
		b1.width=12.2;
		b1.height=5.5;
		b1.depth=5.4;
		b2.width=9.7;
		b2.height=3.5;
		b2.depth=2.3;
		System.out.println("Volume of first box="+b1.Volume());
		System.out.println("Volume of second box="+b2.Volume());
		
		
	}

}