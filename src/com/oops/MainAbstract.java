package com.oops;

public class MainAbstract {
    public static void main(String[] args) {
        ParentClass parObj = new ChidClassA();
        ChidClassA childObj = new ChidClassA();
        childObj.method1();
        parObj.method2();

    }
}
