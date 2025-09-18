package com.xworkz.coffeemachineapp;

import com.xworkz.coffeemachineapp.impl.DripCoffeeMachineImpl;
import com.xworkz.coffeemachineapp.impl.EspressoMachineImpl;
import com.xworkz.coffeemachineapp.impl.FrenchPressMachineImpl;

public class CoffeeMachineRunner {
    public static void main(String[] args) {

        Switch coffee1 = new EspressoMachineImpl();
        coffee1.on();
        coffee1.off();

        Switch coffee2 = new DripCoffeeMachineImpl();
        coffee2.on();
        coffee2.off();

        Switch coffee3 = new FrenchPressMachineImpl();
        coffee3.on();
        coffee3.off();
    }
}

