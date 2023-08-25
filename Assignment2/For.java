package com.assignment2.app;

public class For {
    public static void main(String[] args) {
        int rows = 10; // Number of rows in the pattern
        
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
