package com.assignments;

import java.util.Scanner;

/*
2. Write a program SpringSeason.java that takes two int values
 m and d from the command line and prints true if day d of month m
  is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20),
false otherwise.
*/
public class SpringSeason {
    static int m;
    static int d;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter value of M or month.");
        m = obj.nextInt();
        d = days(obj);
        System.out.println(spring()?"true":"false");
    }

    static int days(Scanner in){
        int numOfDays = 0;
        while(true){
            System.out.println("enter value of d or day.");
            numOfDays = in.nextInt();
            if(numOfDays>=1 && numOfDays<=31){
                break;
            }
            else {
                System.out.println("Invalid input ");
            }
        }

        return numOfDays;
    }
    static boolean spring(){
        boolean value = false;
        if(m>=3 && m<=6){
            if((m==3&&d>=20)||(m==6&&d<20)){
                value = true;
            }
            else if(m>3 || m<6 ){
                value =true;
            }
        }
        else value=false;
        return value;
    }
}
