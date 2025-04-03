package com.xworkz.Runner;

import com.xworkz.Super.Pant;
import com.xworkz.sub.*;

public class PantRunner {
    public static void main(String[] args) {
        Pant  pant = new Pant();
        pant .Button();
        pant.zip();
        pant.pocket();

        Track track = new Track();
        track.Button();
        track.zip();
        track.pocket();

        Jeans jeans = new Jeans();
        jeans.Button();
        jeans.zip();
        jeans.pocket();

        Trekking trekking = new Trekking();
        trekking.Button();
        trekking.zip();
        trekking.pocket();

        Cargo cargo = new Cargo();
        cargo.Button();
        cargo.zip();
        cargo.pocket();

        Formal formal = new Formal();
        formal.Button();
        formal.pocket();
        formal.zip();

        Pant pant1 = new Jeans();
        pant1.pocket();
        pant1.zip();
        pant1.Button();

    }
}
