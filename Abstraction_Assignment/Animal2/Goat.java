package Animal2;

class Goat extends Animal {
    public Goat(int noOfLegs, String color) {
        super(noOfLegs, color);
    }

    @Override
    public String cry() {
        return "Bleat";
    }

    @Override
    public String fly() {
        return "Cannot fly";
    }

    @Override
    public String walk() {
        return "Goat Walking with " + super.noOfLegs + " legs";
    }
}