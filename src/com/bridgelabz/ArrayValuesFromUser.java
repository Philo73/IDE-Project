package com.bridgelabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayValuesFromUser {
    static ArrayList<Integer> arraylist = new ArrayList<>();
    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader reader = new BufferedReader(input);
    static boolean flag = true;
   // static Scanner objSC = new Scanner(System.in);
    static String yORno;

    public static void main(String[] args) throws IOException{
//        userRequest();

        for(int i=0; flag ;i++) {
//            userRequest();
            System.out.print("do you want to add values to the array? Y/N:  ");
            yORno = reader.readLine();

            if(yORno.equals("Y")||yORno.equals("y")) {
//                addValue();
//                System.out.println("input value : "+yORno);
                //userRequest();
                System.out.print("Enter values : " );
                arraylist.add(Integer.parseInt(reader.readLine()));

            } else if((yORno.equals("N")||yORno.equals("n"))) {
                flag=false;
            }
            else {
                System.out.println("enter valid input");
                flag=true;

            }
        }
        System.out.println("Values in Array : "+arraylist);
    }
//    public static void addValue() {
//
//        }
//
//    public static void userRequest() {
//
////        System.out.print("do you want to add values to the array? Y/N:  ");
////        yORno = reader.readLine();
//        System.out.println("User input is ======"+yORno);
//    }

    }

