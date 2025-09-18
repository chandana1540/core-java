package com.xworkz.homelight;

import com.xworkz.homelight.impl.LedBulbImpl;
import com.xworkz.homelight.impl.SmartLightImpl;
import com.xworkz.homelight.impl.TubeLightImpl;

public class LightRunner {
    public static void main(String[] args) {

        Light tubeLight = new TubeLightImpl();
        tubeLight.on();
        tubeLight.off();

        Light ledBulb = new LedBulbImpl();
        ledBulb.on();
        ledBulb.off();

        Light smartLight = new SmartLightImpl();
        smartLight.on();
        smartLight.off();
    }
}

