package com.parsing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter year of birth");

            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {

                int yearOfBirth = scanner.nextInt();
                scanner.nextLine(); //handle next line character key


                System.out.println("Enter Data");
                String name = scanner.nextLine();
                int age = 2019 - yearOfBirth;


                if (age >= 0 && age <= 100) {
                    System.out.println("Name is " + name + " you are " + age + " years old");
                } else {
                    System.out.println("Invalid Year of Birth");
                }
            } else {
                System.out.println("Unable to parse year of birth");
            }
                scanner.close();

    }

}
