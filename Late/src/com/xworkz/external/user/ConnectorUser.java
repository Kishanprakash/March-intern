package com.xworkz.external.user;

import com.xworkz.internal.rule.Connector;

import java.sql.Connection;

public class ConnectorUser {

    Connector  connector ;
   public ConnectorUser (Connector connector){
       System.out.println("this is ");
       this.connector =connector;
    }

    public void Man(){
        System.out.println("running man");
        if(connector!=null){
            connector.run();
        }
    }
}
