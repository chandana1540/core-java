package com.xworkz.sportsapp.impl;

import com.xworkz.sportsapp.SportsEquipment;

public class RacketImpl implements SportsEquipment {

    @Override
    public void on() {
        System.out.println("Racket is in hand. Player starts the rally.");
    }

    @Override
    public void off() {
        System.out.println("Rally stopped. Racket kept aside.");
    }
}
