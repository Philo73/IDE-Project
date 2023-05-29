package com.bridgelabz;

public class Increment {

    public static void main(String[] args) {

        int a = 10;         // a=14
        //a++;

        //post increment
        System.out.println(a++); // a=10
        System.out.println(a); // a=11
        System.out.println(a++);//a=11
        System.out.println(a++);//a=12
        System.out.println(a);//a=13

        //pre increments
        System.out.println(++a);//a=14
        System.out.println(++a);//a=
        System.out.println(a);

        //post decrement
        System.out.println(a--);//a=15

        //pre decrement
        System.out.println(--a);//a=13
    }


}
