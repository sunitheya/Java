package com.pack.dowhile;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        while (num < 15 ){
            num++;
            if(num<=5){
                System.out.println("skipping number "+num);
                continue;
            }
            System.out.println("number "+num);
            if(num>=10){
                System.out.println("break at "+ num);
                break;
            }
        }

    }
}
