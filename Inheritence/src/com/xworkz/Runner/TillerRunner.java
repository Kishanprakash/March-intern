package com.xworkz.Runner;

import com.xworkz.Super.Tractor;
import com.xworkz.sub.Tiller;

public class TillerRunner {
    public static void main(String[] args) {
        Tractor tractor = new Tractor();
        tractor.rent();
        tractor.driver();
        tractor.color();

        Tiller tiller = new Tiller();
        tiller.color();
        tiller.rent();
        tiller.driver();

        Tractor tractor1 = new Tiller();
        tractor1 .color();
        tractor1.rent();
        tractor1.driver();
    }
}
