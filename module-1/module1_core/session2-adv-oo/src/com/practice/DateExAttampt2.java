package com.practice;

import java.util.Scanner;

/*
    hands on
    you have today date find next date
    3/2/2024		4/2/2024
    28/2/2024		29/2/2024
                1/3/2024

    31/12/2024
    1/1/2025
    1. logic
    2. how to write that logic in OO ways
 */
public class DateExAttampt2 {
    public static void main(String[] args) {

        int day, month, year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("PE day");
        day=scanner.nextInt();

        System.out.println("PE month");
        month=scanner.nextInt();

        System.out.println("PE year");
        year=scanner.nextInt();

        System.out.println("date is : "+ day+"/"+ month+"/"+year);

        //i need to manage the no of days in a month
        int noOfDays[]={-1, 31,28 ,31,30 ,31 ,30 ,31,31 ,30 ,31,30, 31 };

        if(isLeapYear(year)){
            noOfDays[2]=29;
        }

        //i need to check for leap year
        day++;
        if(day>noOfDays[month]){
            day=1;
            month++;
            if(month>12){
                month=1;
                year++;
            }
        }

        System.out.println("next date is : "+ day+"/"+ month+"/"+year);
    }
    public static boolean isLeapYear(int year){
        if( (year%400==0 || year%100!=0) &&(year%4==0))
            return true;
        else
            return false;
    }
}
