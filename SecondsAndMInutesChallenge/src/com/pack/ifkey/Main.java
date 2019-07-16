package com.pack.ifkey;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDuration(3542));

    }
    private static String getDurationString(long minutes,long seconds){
        if((minutes<0) || (seconds<0) || (seconds >59)){
            return "Invalid value";

        }
        long hours = minutes/60;
        long remaingMinutes = minutes%60;
        String hourString = hours +"h";
        if(hours<10){
            hourString = "0" + hourString;
        }
        String minuteString = remaingMinutes +"m";
        if(minutes<10){
            minuteString = "0" + minuteString;
        }
        String secString = seconds +"s";
        if(seconds<10){
            secString = "0" + secString;
        }
        return hourString+" "+minuteString+" "+secString+" ";
    }
    private static String getDuration(long seconds){
        if(seconds<0){
            return "Invalid value";
        }
        long minutes = seconds/60;
        long remainingSeconds = seconds%60;
        return getDurationString(minutes,remainingSeconds);
    }
}
