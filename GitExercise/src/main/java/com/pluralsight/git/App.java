package com.pluralsight.git;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = inputSc.nextLine().trim();

        System.out.printf("Hello %s!", name);
    }
}
