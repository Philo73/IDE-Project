package com.bridgelabz;

import java.util.Scanner;

public class StringCompare {
    static String email;
    static String confirm_email;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter email : ");
        email = obj.nextLine();
        System.out.print("Re-enter email : ");
        confirm_email = obj.nextLine();
        if(email.equals(confirm_email)){
            System.out.println("email ID confirmed ");
        }
        else{
            System.out.println("email ID doesn't match");
        }
    }

}
