package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddValuesToArrayUsingWhile {
    static ArrayList<Integer> arraylist = new ArrayList<Integer>();
    static String yORno;
    static Scanner objSC = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args) {
        userRequest();
        addValue();

        System.out.print(arraylist);
    }

    public static void addValue(){
        while(flag) {
            System.out.print("Enter values : ");
            arraylist.add(objSC.nextInt());
//            yORno=" ";
            userRequest();
        }
    }
    public static void userRequest() {
        System.out.print("do you want to add values to the array? Y/N:  ");
        yORno = objSC.nextLine();
        if(yORno.equals("Y")||yORno.equals("y")){
            flag=true;
        }
        else {
            System.out.println("Enter valid input");
            flag=false;
        }
    }
}
