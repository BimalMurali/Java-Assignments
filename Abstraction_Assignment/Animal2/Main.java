package Animal2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(4, "Gray");
        Dog dog = new Dog(4, "Brown");
        Goat goat = new Goat(4, "White");
        Crow crow = new Crow(2, "Black");
        Chicken chicken = new Chicken(2, "Brown");

        System.out.println("Cat says: " + cat.cry());
        System.out.println("Dog says: " + dog.cry());
        System.out.println("Goat says: " + goat.cry());
        System.out.println("Crow says: " + crow.cry());
        System.out.println("Chicken says: " + chicken.cry());
        System.out.println("Cat can " + cat.fly());
        System.out.println("Dog can " + dog.fly());
        System.out.println("Goat can " + goat.fly());
        System.out.println("Crow can " + crow.fly());
        System.out.println("Chicken can " + chicken.fly());

        System.out.println(cat.walk());
        System.out.println(dog.walk());
        System.out.println(goat.walk());
        System.out.println(crow.walk());
        System.out.println(chicken.walk());
    }
}
