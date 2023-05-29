package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
//    static boolean isPrime=false;
    static int count;
    static ArrayList<Integer> primeArray = new ArrayList<Integer>();
    public static void main(String[] args) {

        System.out.println("To find the prime numbers between two numbers...");
        Scanner objSc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int firstNumber = objSc.nextInt();
        System.out.print("enter Second number : ");
        int secondNumber = objSc.nextInt();
        Prime(firstNumber, secondNumber);
        System.out.println(primeArray);
    }

    private static void Prime(int firstNumber, int secondNumber) {

        for(int i = firstNumber; i<secondNumber; i++){
            count = 0;
            if(i<=2 && i!=1){primeNumber(i);}
            for (int j = 1; j <= i; j++) {
                if (i % j != 0) {
                count = count +1;
                    if(count==i-2){
                        primeNumber(i);
                    }
                }
            }
        }

    }
    public static void primeNumber(int p){
        primeArray.add(p);
    }

}
