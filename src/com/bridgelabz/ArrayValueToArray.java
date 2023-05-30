package com.bridgelabz;

import java.util.ArrayList;

public class ArrayValueToArray {
    public static void main(String[] args) {
        int[] array1 = {3,5,7,9,4,2};
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        for(int a:array1){
            array2.add(a);
        }
        System.out.print("Array1 : \n"+array1+"\nArray2 : \n"+array2);
    }
}
