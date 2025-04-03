package com.xworkz.Runner;

import com.xworkz.Super.Vehicle;
import com.xworkz.sub.*;

import java.sql.PseudoColumnUsage;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle .engine();
        vehicle.tyre();

        BMW bmw = new BMW();
        bmw .engine();
        bmw.tyre();

        Mahindra mahindra = new Mahindra();
        mahindra.engine();
        mahindra.tyre();

        Benz benz = new Benz();
        benz.engine();
        benz.tyre();

        Lamborginnni lamborginnni = new Lamborginnni();
        lamborginnni.engine();
        lamborginnni.tyre();

        Suzuki suzuki= new Suzuki();
        suzuki.engine();
        suzuki.tyre();
    }
}
