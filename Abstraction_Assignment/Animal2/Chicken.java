package Animal2;
class Chicken extends Animal {
    public Chicken(int noOfLegs, String color) {
        super(noOfLegs, color);
    }

    @Override
    public String cry() {
        return "Cluck";
    }

    @Override
    public String fly() {
        return "Can fly at a height of 10 feet";
    }

    @Override
    public String walk() {
        return "Chicken Walking with " + super.noOfLegs + " legs";
    }
}
