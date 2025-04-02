package com.xworkz.staticvariables;

public class Test {
    static int num;

    static {
        System.out.println("Static block executed!");
        num = 10;
    }

    public static void display() {
        System.out.println("Value of num: " + num);
    }
}
