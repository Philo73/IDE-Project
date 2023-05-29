package com.bridgelabz;

import java.util.Scanner;

public class SumOfEven {
    static int number;
    static int count;
    static int i=1;
    static int sumOfEven;
    public static void main(String[] args) {
        Scanner objsc= new Scanner(System.in);
        System.out.println("Enter number to find sum of even numbers : " );
        number = objsc.nextInt();
        sumEven();
    }
    public static void sumEven(){
        for(;i<=number;i++){

            if(i%2==0){
                sumOfEven = sumOfEven+i;
                count= count + 1;
            }

        }
        System.out.println("Sum of even numbers: "+sumOfEven);
        System.out.println("number of even numbers: "+count);
    }
}
