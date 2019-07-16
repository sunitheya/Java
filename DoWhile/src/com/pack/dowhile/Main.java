package com.pack.dowhile;

public class Main<count> {

    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("count value is " + count);
            count++;
        }
        count = 4;
        do {
            System.out.println("count value is " + count);
            count++;
        } while (count != 6);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

        count = 4;
        int endCount = 100;
        while (count <= endCount){
            count++;
            if(!isEvenNumber(count)){
                continue;
        } System.out.println("Odd Number");

        }


    }

