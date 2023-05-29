package com.bridgelabz;

import java.util.Scanner;

public class ArrayIndexOfSumValue {

    static int sumValue;
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter value of sum : ");
        sumValue=obj.nextInt();
        System.out.println(numbers[2]);
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1;j++){
                if(sumValue==numbers[i]+numbers[j]){
                    System.out.println("first number : "+numbers[i]+"; index value : "+i+"\nsecond number : "+numbers[j]+"; index value : "+j+"\n");
                }
            }
        }

    }

}
