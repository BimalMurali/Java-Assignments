package com.assignment2.app;

public class Box {
    
    // Method to calculate the volume
    public double calculateVolume(double height,double width,double depth) {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create two Box objects
        Box box1 = new Box();
        Box box2 = new Box();
        
        // Calculate and print the volumes
        System.out.println("Volume of Box 1: " + box1.calculateVolume(1,2,3));
        System.out.println("Volume of Box 2: " + box2.calculateVolume(4,5,6));
    }
}