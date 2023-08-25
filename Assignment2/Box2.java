package com.assignment2.app;

class Box2 {
    private double width;
    private double height;
    private double depth;
    
    // Constructor
    public Box2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    // Method to calculate the volume
    public double calculateVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create two Box objects
        Box2 obj1  = new Box2(10.0, 5.0, 3.0);
        Box2 obj2 =new Box2(20.0,30.0,40.0);
        
        // Calculate and print the volumes
        System.out.println("Volume of Box 1: " + obj1.calculateVolume());
        System.out.println("Volume of Box 2: " + obj2.calculateVolume());
    }
}
