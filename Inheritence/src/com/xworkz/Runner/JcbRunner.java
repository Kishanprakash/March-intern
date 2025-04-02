package com.xworkz.Runner;

import com.xworkz.Super.Jcb;
import com.xworkz.sub.Hitachi;

public class JcbRunner {
    public static void main(String [] args){
        Jcb jcb = new Jcb();
        jcb.color();
        jcb.driver();
        jcb.rent();

        Hitachi hitachi=new Hitachi();
        hitachi.color();
        hitachi.rent();
        hitachi.driver();


        Jcb jcb1=new Hitachi();
        jcb1.rent();
        jcb1.driver();
        jcb1.color();


    }
}
