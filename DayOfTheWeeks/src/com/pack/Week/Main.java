package com.pack.Week;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(1);
        printDayOfTheWeek(7);

    }
    private static void printDayOfTheWeek(int day){
        if(day == 0){
            System.out.println("sunday");
        } else if(day == 1){
            System.out.println("monday");
        } else if(day == 3){
            System.out.println("tuesday");
        } else System.out.println("Invalid");

//        switch (day){
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//
//                default:
//                    System.out.println("Invalid");
//
//
//        }
    }
}
