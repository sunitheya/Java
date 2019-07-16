package com.operators;

public class Main {

    public static void main(String[] args) {
        int result = 3;
        result += 3;
        System.out.println("Result is :"+ result);
        result *= 2;
        System.out.println("Result is :"+ result);
        boolean islogic = false;
        if (islogic = true)
            System.out.println("Logic not true");
        int numb = 60;
        if ((islogic == false) && (numb <= 500))
            System.out.println("Satisfies both logics");
        double varFi = 20;
        double varSe = 80;
        double sumFi = (varFi+varSe)*25;
        System.out.println("My sum :"+ sumFi);
        double remFi = sumFi%40;
        System.out.println("Remainder ="+remFi);
        if (remFi <= 20)
            System.out.println("Total was over the limit");



    }
}
