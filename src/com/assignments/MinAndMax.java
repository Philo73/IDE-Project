package com.assignments;

import java.util.Scanner;

/*
1. Enter two numbers and do the following arithmetic Operations find max and min.
i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c
 */
public class MinAndMax {
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter value of a");
        a = obj.nextInt();
        System.out.println("Enter value of b");
        b = obj.nextInt();
        System.out.println("Enter value of c");
        c = obj.nextInt();
        System.out.println(method1());
        System.out.println(method2());
        System.out.println(method3());
        System.out.println(method4());
        if(method1()>method2()){
            if(method1()>method3()){
                if(method1()>method4()){
                    System.out.println(method1()+" is Maximum");
                }
                else{
                    System.out.println(method4()+" is Maximum");
                }
            }
            else {
                if(method3()>method4()){
                    System.out.println(method3()+" is Maximum");
                }
                else{
                    System.out.println(method4()+" is Maximum");
                }
            }
        }
        else {
            if(method2()>method3()){
                if(method2()>method4()) {
                    System.out.println(method2()+" is Maximum");
                }
                else{
                    System.out.println(method4()+" is Maximum");
                }
            }
            else {
                if(method3()>method4()){
                    System.out.println(method3()+" is Maximum");
                }
                else{
                    System.out.println(method4()+" is Maximum");
                }

            }

        }
        if(method1()<method2()){
            if(method1()<method3()){
                if(method1()<method4()){
                    System.out.println(method1()+" is Minimum");
                }
                else{
                    System.out.println(method4()+" is Minimum");
                }
            }
            else {
                if(method3()<method4()){
                    System.out.println(method3()+" is Minimum");
                }
                else{
                    System.out.println(method4()+" is minimum");
                }
            }
        }
        else {
            if(method2()<method3()){
                if(method2()<method4()) {
                    System.out.println(method2()+" is Minimum");
                }
                else{
                    System.out.println(method4()+" is Minimum");
                }
            }
            else {
                if(method3()<method4()){
                    System.out.println(method3()+" is Minimum");
                }
                else{
                    System.out.println(method4()+" is Minimum");
                }

            }

        }
    }
    static int method1(){
        return a+b*c;
    }
    static int method2(){
        return c+a/b;
    }
    static int method3(){
        return a%b+c;
    }
    static int method4(){
        return a*b+c;
    }

}
