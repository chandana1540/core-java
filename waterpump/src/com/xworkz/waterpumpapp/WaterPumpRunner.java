package com.xworkz.waterpumpapp;

import com.xworkz.waterpumpapp.impl.BoosterPumpImpl;
import com.xworkz.waterpumpapp.impl.CentrifugalPumpImpl;
import com.xworkz.waterpumpapp.impl.SubmersiblePumpImpl;

public class WaterPumpRunner {
public static void main(String[] args) {

    Switch pump1 = new SubmersiblePumpImpl();
    pump1.on();
    pump1.off();

    Switch pump2 = new CentrifugalPumpImpl();
    pump2.on();
    pump2.off();

    Switch pump3 = new BoosterPumpImpl();
    pump3.on();
    pump3.off();
}
}
