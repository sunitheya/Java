package com.fipackage;

public class Main {

    public static void main(String[] args) {
        long myLong = 12830002020L;
        System.out.println(myLong);
        byte mybyte = -126;
        byte newByte =(byte)(mybyte/2);
        System.out.println("New Byte :"+newByte);
        long fiLong = 5000000 + 10 * (mybyte+ newByte);
        System.out.println(fiLong);


    }
}
