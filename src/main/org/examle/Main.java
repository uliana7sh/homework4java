package main.org.examle;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter please current time a hour(9-17):");
        int currentHour=scanner.nextInt();
        System.out.println("Enter please current time minutes:");
        int currentMin=scanner.nextInt();
        int allWorkDaySek=(17-9)*60*60;
        System.out.println("All work day seconds:"+allWorkDaySek);
        int leftSek=((currentHour-9)*60+currentMin)*60;
        System.out.println("Seconds left:"+leftSek);
        int restOfTimeSek=allWorkDaySek-leftSek;
        System.out.println("Rest of time in seconds:" +restOfTimeSek);
        System.out.println("Rest of time in minutes:"+restOfTimeSek/60);
        System.out.println("Rest of time in hours:"+restOfTimeSek/60/60);
        scanner.close();
    }
}
