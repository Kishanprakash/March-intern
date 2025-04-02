package com.xworkz.Runner;

import com.xworkz.Super.Vegetables;
import com.xworkz.sub.Tomato;

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

    }
}
