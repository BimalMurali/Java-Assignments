package Animal2;

class Dog extends Animal {
    public Dog(int noOfLegs, String color) {
        super(noOfLegs, color);
    }

    @Override
    public String cry() {
        return "Bark";
    }

    @Override
    public String fly() {
        return "Cannot fly";
    }

    @Override
    public String walk() {
        return "Dog Walking with " + super.noOfLegs + " legs";
    }
}
