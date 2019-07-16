package com.parsing;

public class Main {

    public static void main(String[] args) {
        String numAsString = "2019";
        System.out.println("numAsString = " + numAsString.charAt(2));
        int number = Integer.parseInt(numAsString);
        System.out.println(numAsString);
        numAsString += 1;
        number +=1;
        System.out.println(numAsString);
        System.out.println(number);

    }
}
