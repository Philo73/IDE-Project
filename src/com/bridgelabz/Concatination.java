package com.bridgelabz;

import java.util.Scanner;

public class Concatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Name and Number:");


        int num = sc.nextInt();
        String name = sc.nextLine();
        System.out.println(name+" "+num);

//        String firstName = "Philips";
//        String LastName = "Pulipati";
//        int LastTwoDigits = 73;
//        String code = firstName+LastName+LastTwoDigits;
//        System.out.println(code);
//        System.out.println(firstName+" "+LastName+" "+LastTwoDigits );
    }
}
