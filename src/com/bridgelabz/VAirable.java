package com.bridgelabz;

public class VAirable {

    static int m=100;//static variable
    int n = 50;
    public void main(String args[])
    {
        int data=50;//local variable
        System.out.println(n);
        System.out.println(data);
        System.out.println(m);
    }
    void method()
    {
        int n=90;//local variable
        System.out.println(n);
        VAirable obj = new VAirable();
//        System.out.println(obj.data);
        System.out.println(m);
    }


}


