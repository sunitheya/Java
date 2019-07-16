package com.pack.Week;

public class Main {

    public static void main(String[] args) {
        for(int i=2;i<9;i++){
            System.out.println("10000 at "+i+" percent interest "+String.format("%.2f",calcInterest(10000,i)));
        }

    }
    public static double calcInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
