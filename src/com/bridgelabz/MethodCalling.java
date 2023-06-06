package com.bridgelabz;

import java.util.Scanner;

public class MethodCalling {
    double a;
    double b;
    double sum;
    public static void main(String[] args) {
        Scanner object_sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        double a = object_sc.nextDouble();
        System.out.print("enter second number: ");
        double b = object_sc.nextDouble();

//        double sumValue = add(a,b);
        double diffValue = difference(a,b);
        double prodValue = product(a,b);
        double divValue = division(a,b);
        double percValue = percentile(a,b);

//        System.out.println("Sum of two numbers = "+sumValue);
        System.out.println("Difference of two numbers = "+diffValue);
        System.out.println("Product of two numbers = "+prodValue);
        System.out.println(a+" divided by "+b+" = "+divValue);
        System.out.println(a+" Mod of "+b+" = "+percValue);

    }
//    public MethodCalling(double a, double b){
//        double sum;
//        this.sum = a+b;
//        System.out.println("value of sum with constructor"+this.sum);
//
//    }
    public static void add(double a, double b){
        double sum;
        sum = a+b;
//        return sum;

    }
    public static double difference(double a, double b){
        double diff;
        diff = a-b;
        return diff;
    }
    public static double product(double a, double b){
        double product;
        product = a*b;
        return product;
    }
    public static double division(double a, double b){
        double div;
        div = a/b;
        return div;
    }
    public static double percentile(double a, double b){
        double per;
        per = a%b;
        return per;
    }

}
