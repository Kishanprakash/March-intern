package com.xworkz.Runner;

import com.xworkz.Super.Police;
import com.xworkz.sub.*;

public class PoliceRunner {
    public static void main(String[] args) {
        Police police = new Police();
        police.cops();
        police.jeep();
        police.security();

        Lati lati =  new Lati();
        lati.cops();
        lati.jeep();
        lati.security();

        Uniform uniform = new Uniform();
        uniform.cops();
        uniform.jeep();
        uniform.security();

        FIR fir = new FIR();
        fir.cops();
        fir.jeep();
        fir.security();

        Aeroplane aeroplane = new Aeroplane();
        aeroplane.cops();
        aeroplane.jeep();
        aeroplane.security();

        Station station = new Station();
        station.cops();
        station.jeep();
        station.security();

        Police police1 = new Police();
        police1.jeep();
        police1.cops();
        police1.security();

    }
}
