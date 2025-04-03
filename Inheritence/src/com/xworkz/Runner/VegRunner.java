package com.xworkz.Runner;

import com.xworkz.Super.Vegetables;
import com.xworkz.sub.*;

public class VegRunner {
    public static void main(String[] args) {
        Vegetables vegetables=new Vegetables();
        vegetables.color();
        vegetables.kilo();

        Tomato tomato=new Tomato();
        tomato.color();
        tomato.kilo();

        Vegetables vegetables1=new Tomato();
        vegetables1.kilo();
        vegetables1.color();

        Carrot carrot = new Carrot();
        carrot .color();
        carrot.kilo();

        Pumpkin pumpkin = new Pumpkin();
        pumpkin.color();
        pumpkin.kilo();

        Brinjal brinjal = new Brinjal();
        brinjal.color();
        brinjal.kilo();

        Cucumber cucumber =  new Cucumber();
        cucumber.color();
        cucumber.kilo();

        Vegetables vegetables2 = new Brinjal();
        vegetables2.color();
        vegetables2.kilo();

    }
}
