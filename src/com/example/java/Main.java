package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create a float variable for the temperature
        float temperature;
        Scanner scanner = new Scanner(System.in);

        //get temperature from the user and assign to temperature variable.
        System.out.println("Enter a temperature between 92 and 104: ");
        temperature = scanner.nextFloat();

        //use conditionals to display to the user whether the temperature is low, normal or high based on there input.
        //if below 97.5 temperature is low.
        if (temperature < 97.5) {
            System.out.println("The temperature is low.");
        }
        //else if its below 99.5 (and wasnt below 97.5) its normal.
        else if (temperature < 99.5) {
            System.out.println("The temperature is normal.");
        }
        //else, it's not any of the other conditions, its high.
        else {
            System.out.println("The temperature is high.");
        }
    }
}
