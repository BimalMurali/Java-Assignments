package com.assignment2.app;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.println("Help on:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for");
            System.out.println("6. Exit");
            System.out.print("Choose one: ");
            
            choice = scanner.next().charAt(0);
            
            switch (choice) {
                case '1':
                    System.out.println("The if:");
                    System.out.println("if (condition) {");
                    System.out.println("    statement;");
                    System.out.println("}");
                    break;
                    
                case '2':
                    System.out.println("The switch:");
                    System.out.println("switch (expression) {");
                    System.out.println("    case constant:");
                    System.out.println("        statement sequence;");
                    System.out.println("    // ...");
                    System.out.println("}");
                    break;
                    
                case '3':
                    System.out.println("The while:");
                    System.out.println("while (condition) {");
                    System.out.println("    statement;");
                    System.out.println("}");
                    break;
                    
                case '4':
                    System.out.println("The do-while:");
                    System.out.println("do {");
                    System.out.println("    statement;");
                    System.out.println("} while (condition);");
                    break;
                    
                case '5':
                    System.out.println("The for:");
                    System.out.println("for (initialization; condition; iteration) {");
                    System.out.println("    statement;");
                    System.out.println("}");
                    break;
                    
                case '6':
                    System.out.println("Exiting Help System. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            
        } while (choice != '6');
        
        scanner.close();
    }
}
