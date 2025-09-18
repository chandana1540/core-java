package com.xworkz.machineapp;

import com.xworkz.machineapp.Impl.HairImpl;
import com.xworkz.machineapp.Impl.LGImpl;
import com.xworkz.machineapp.Impl.SamsungImpl;

public class WashingMachineRunner {
    public static void main(String[] args) {
        Switch switch0 = new HairImpl();
        switch0.start();
        switch0.stop();

        Switch switch1 = new SamsungImpl();
        switch1.start();
        switch1.stop();

        Switch switch2 = new LGImpl();
        switch2.start();
        switch2.stop();

    }
}
