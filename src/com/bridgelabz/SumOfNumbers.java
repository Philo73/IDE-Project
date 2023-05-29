package com.bridgelabz;

import java.util.Scanner;

public class SumOfNumbers {
    static int number;
    static int sum;
    static int count;

    public static void main(String[] args) {
        Scanner objsc = new Scanner(System.in);
        System.out.print("enter the number : ");
        number = objsc.nextInt();

        sum();
    }
    public static void sum(){
        int i;

        for (i=0; i <= number; i++) {
            sum += i;
            count = i;
//
        }
        System.out.println("count : "+count);
        System.out.println("total_sum : "+sum);
    }
}

