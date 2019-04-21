package com.example.java;

import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {
        /**
         * Create an application that calculates the area and perimeter of a rectangle
         * formulas: width * legnth;
         * perimeter: 2*width + 2*length
         * The application should accept decimal entry like 10.5 and 20.65
         * Assume that the user will enter valid numeric data for the length and width
         * The application should continue only if the user enters y or Y to continue
         */

        // display welcome message
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // perform calculation until choice isn't equal to y or Y
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.println("Enter length: ");
            double length = sc.nextDouble();

            System.out.println("Enter width: ");
            double width = sc.nextDouble();

            // perform area and perimeter calculations
            double area = length * width;
            double perimeter = 2*length + 2*width;

            // display result
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();

            // see if the user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();
    }
}
