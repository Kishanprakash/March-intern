package com.xworkz.type1;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber = new Tyre();
        rubber.expand();
        


        Tyre tyre = new Tyre();
        tyre.expand();

        Rubber rubber1 = new Rubber();
        rubber1.expand();

        MRFTyre mrfTyre = new MRFTyre();


        System.out.println("__________________");
        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.Wheel(rubber);
        armyVehicle.Wheel(tyre);
        armyVehicle.Wheel(rubber1);
        armyVehicle.Wheel(mrfTyre);
    }
}
