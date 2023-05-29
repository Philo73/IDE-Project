package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {
    static int year;

    public static void main(String[] args) {
        Scanner Object_sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        year = Object_sc.nextInt();
        if((year%4==0 && year%100 !=0) || year%400==0){
            System.out.println("leap year..!!");
        }
        else{
            System.out.println("not a leap year..!!");
        }
    }
}
