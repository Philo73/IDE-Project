package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayValuesFromUser {
    static ArrayList<Integer> arraylist = new ArrayList<Integer>();
    static boolean flag = true;
    static Scanner objSC = new Scanner(System.in);
    static String yORno;

    public static void main(String[] args) {
//        userRequest();

        for(int i=0; flag ;i++) {
            userRequest();

            if(yORno.equals("Y")||yORno.equals("y")) {
                addValue();
                System.out.println("input value : "+yORno);
                //userRequest();

            } else {
                flag=false;
            }
        }
        System.out.println("Values in Array : "+arraylist);
    }
    public static void addValue(){
        System.out.print("Enter values : " );
        arraylist.add(objSC.nextInt());
        }

    public static void userRequest() {

        System.out.print("do you want to add values to the array? Y/N:  ");
        yORno = objSC.nextLine();
        System.out.println("User input is ======"+yORno);
    }

    }

