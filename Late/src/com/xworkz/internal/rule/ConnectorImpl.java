package com.xworkz.internal.rule;

public class ConnectorImpl implements Connector{
    public  ConnectorImpl(){
        System.out.println("this is no arg const");
    }
    @Override
    public void run() {
        System.out.println("this is connec");
    }
}
