package Animal2;

public class Cat extends Animal {

	public Cat(int noOfLegs, String color) {
		super(noOfLegs, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return "Meow";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Cannot Fly";
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
        return "Cat Walking with " + super.noOfLegs + " legs";
	}

}
