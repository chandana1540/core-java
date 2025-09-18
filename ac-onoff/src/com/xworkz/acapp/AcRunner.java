package com.xworkz.acapp;

import com.xworkz.acapp.impl.HairImpl;
import com.xworkz.acapp.impl.LGImpl;
import com.xworkz.acapp.impl.SamsungImpl;
import com.xworkz.acapp.impl.SonyImpl;

public class AcRunner {
    public static void main(String[] args) {
        Switch aSwitch = new HairImpl();
        aSwitch.on();
        aSwitch.off();

        Switch aSwitch1 = new LGImpl();
        aSwitch1.on();
        aSwitch1.off();

        Switch aSwitch2 = new SamsungImpl();
        aSwitch2.on();
        aSwitch2.off();

        Switch aSwitch3 = new SonyImpl();
        aSwitch3.on();
        aSwitch3.off();
    }
}
