package com.practice;

import java.util.Scanner;
import java.util.StringJoiner;

class Date{
   private int day;
    private int month;
    private int year;
    private static int noOfDays[]={-1, 31,28 ,31,30 ,31 ,30 ,31,31 ,30 ,31,30, 31 };

    private int getNoOfDaysInMonth(int month){
        return noOfDays[month];
    }
    public Date(String dateString, String formate) {
        //string split
//
//        this.day = day;
//        this.month = month;
//        this.year = year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date previousDate(){
        return null;
    }

    public Date nextDate(){
        int day=this.day, month=this.month, year=this.year;
        day++;
        if(day>noOfDays[month]){
            day=1;
            month++;
            if(month>12){
                month=1;
                year++;
            }
        }
        return new Date(day, month, year);
    }

    public  boolean isLeapYear(){
        if( (year%400==0 || year%100!=0) &&(year%4==0))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Date.class.getSimpleName() + "[", "]")
                .add("day=" + day)
                .add("month=" + month)
                .add("year=" + year)
                .toString();
    }
}
public class DateExAttampt3 {
    public static void main(String[] args) {

        int day, month, year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("PE day");
        day=scanner.nextInt();

        System.out.println("PE month");
        month=scanner.nextInt();

        System.out.println("PE year");
        year=scanner.nextInt();

        Date date=new Date(day, month, year);


    }
}
