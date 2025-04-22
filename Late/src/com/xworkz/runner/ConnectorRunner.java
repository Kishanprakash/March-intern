package com.xworkz.runner;

import com.xworkz.external.user.ConnectorUser;
import com.xworkz.internal.rule.Connector;
import com.xworkz.internal.rule.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImpl();
        ConnectorUser connectorUser =new ConnectorUser(connector);
        connectorUser.Man();




    }

}
