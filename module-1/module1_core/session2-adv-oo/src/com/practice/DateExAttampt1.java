package com.practice;
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
public class DateExAttampt1 {
    public static void main(String[] args) {
        int day, month, year;
        day=31;

        month=7;

        year=2023;

        //i need to manage the no of days in a month
        int noOfDays[]={-1, 31,28 ,31,30 ,31 ,30 ,31,31 ,30 ,31,30, 31 };

        System.out.println(noOfDays[1]);
        //i need to check for leap year

        if( (year%400==0 || year%100!=0) &&(year%4==0))
            System.out.println("year is leap year");
        else
            System.out.println("it is not a leap year");

        day++;
    }
}
