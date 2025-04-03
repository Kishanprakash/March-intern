package com.xworkz.Runner;

import com.xworkz.Super.Plant;
import com.xworkz.sub.*;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant = new Plant();
        plant.leaf();
        plant.stem();

        Jasmine jasmine = new Jasmine();
        jasmine.leaf();
        jasmine.stem();

        Lambus lambus = new Lambus();
        lambus.leaf();
        lambus.stem();

        Lotus lotus = new Lotus();
        lotus.leaf();
        lotus.stem();

        Rose rose = new Rose();
        rose .leaf();
        rose.stem();
        Sunflower sunflower = new Sunflower();
        sunflower.leaf();
        sunflower.stem();

    }
}
