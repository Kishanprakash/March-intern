package com.xworkz.Runner;

import com.xworkz.Super.Sports;
import com.xworkz.sub.*;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sports = new Sports();
        sports.endurance();
        sports.energy();
        sports.health();
        sports.stamina();

        Football football = new Football();
        football.endurance();
        football.energy();
        football.health();
        football.stamina();

        Cricket cricket = new Cricket();
        cricket.endurance();
        cricket.energy();
        cricket.health();
        cricket.stamina();

        Handball handball = new Handball();
        handball.endurance();
        handball.energy();
        handball.health();
        handball.stamina();

        Lagori lagori= new Lagori();
        lagori .endurance();
        lagori.energy();
        lagori.health();
        lagori.stamina();

        Hockey hockey = new Hockey();
        hockey.endurance();
        hockey.energy();
        hockey.health();
        hockey.stamina();

        Sports sports1 = new Football();
        sports1.endurance();
        sports1.energy();
        sports1.health();
        sports1.stamina();
    }
}
