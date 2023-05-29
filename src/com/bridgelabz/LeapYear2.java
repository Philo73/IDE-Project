package com.bridgelabz;

import java.util.Scanner;

public class LeapYear2 {
    static int year;
    public static void main(String[] args) {
        Scanner objSc = new Scanner(System.in);
        System.out.print("enter Year : ");
        year= objSc.nextInt();
        System.out.println(leapcheck(year)?"Leap year..!!":"not Leap year..!!");
    }
    public static boolean leapcheck(int year_pera){
       return ((year_pera%4==0)&& (year_pera%100!=0) || year_pera%400 ==0);
    }
}
