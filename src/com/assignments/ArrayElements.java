package com.assignments;

public class ArrayElements {
    static int[] num = {11,12,13,14,15,16,17,18,19,10,11,12,22};
    static int largeElement;
    static int smallElement=num[0];
    static int position=0;

    public static void main(String[] args) {
        printElements(); // prints ele in array and print reverse ele
        //prints Large Number
        System.out.println("\nLarge Element : "+largeElement);
        //prints Small Number
        System.out.println("\nSmall Element : "+smallElement);
    }
    public static void printElements(){
        for (int a:num) {

            System.out.print(" "+a);
            //iteration for large element
            if(a>=largeElement){
                largeElement=a;
            }
            //iteration for Small element
            if(a<=smallElement){
                smallElement=a;
            }

            //System.out.println(largeElement);
        }
        System.out.println("\n");
        //for reverse Display of elements
        for(int i=num.length-1;i>=0;i--){
            System.out.print(" "+num[i]);
        }
        System.out.println("\n");
        for (int b:num) {
            if (position % 2 != 0) {
                System.out.println("Even position" +b);
            }
            position++;
        }
        position=0;
        System.out.println("\n");
        for (int c:num){
            if(position % 2 == 0) {
                System.out.println("odd position" +c);
            }
            position++;
        }
    }
}
