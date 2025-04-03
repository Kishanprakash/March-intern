package com.xworkz.Runner;

import com.xworkz.Super.Bus;
import com.xworkz.sub.Transport;

public class TransportRunner {
    public static void main(String[] args) {
        Bus bus= new Bus();
        bus.cycle();
        bus.rikshaw();
        bus.train();
        Transport transport = new Transport();
        transport .cycle();
        transport.rikshaw();
        transport.train();

        Bus bus1 = new Transport();
        bus1.train();
        bus1.rikshaw();
        bus1.cycle();
    }
}
