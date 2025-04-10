package com.xworkz.tostring.Internal;

public class  Bank {
    private String name;
    private String branch;
    private int balance;

    public Bank(String name, String branch, int balance) {
        this.name = name;
        this.branch = branch;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank name " + this.name + " branch " + this.branch + " Balance " + this.balance;
    }

    @Override
    public int hashCode() {
        System.out.println("the code is : " +super.hashCode());
        return 45;
    }
}
