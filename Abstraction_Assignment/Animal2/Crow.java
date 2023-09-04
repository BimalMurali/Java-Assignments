package Animal2;

class Crow extends Animal {
    public Crow(int noOfLegs, String color) {
        super(noOfLegs, color);
    }

    @Override
    public String cry() {
        return "Caw";
    }

    @Override
    public String fly() {
        return "Can fly at a height of 100 feet";
    }

    @Override
    public String walk() {
        return "Crow Walking with " + super.noOfLegs + " legs";
    }
}