package com.assignments;

public class ArrayElements2 {
    static int[] num = {11,12,13,14,15,16,17,18,19,10,11,12,22};
    static int dupNum;

    public static void main(String[] args) {
        duplicate();

    }

    public static void duplicate(){
        for (int a:num) {
            dupNum = num[a];
            for (int b:num){
                if(dupNum==num[b] && a!=b){
                    System.out.println(dupNum);
                }
            }
        }
    }
}
