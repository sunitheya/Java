package com.pack.Switch;

public class Main {

    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println("Was 1");
                break;
            case 2:
                System.out.println("Was 2");
                break;

            case 3 : case 4:
                System.out.println("Was 3");
                break;
                default:
                    System.out.println("Was something else");


        }



    }
}
