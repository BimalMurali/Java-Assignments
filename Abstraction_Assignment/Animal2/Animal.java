package Animal2;

    abstract class Animal {
	     int noOfLegs;
	     String color;

	    public Animal(int noOfLegs, String color) {
	        this.noOfLegs = noOfLegs;
	        this.color = color;
	    }

	    public abstract String cry();
	    public abstract String fly();
	    public abstract String walk();
	}



