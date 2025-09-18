package com.xworkz.entertainmentapp.impl;

import com.xworkz.entertainmentapp.EntertainmentDevice;

public class GameConsoleImpl implements EntertainmentDevice {

    @Override
    public void on() {
        System.out.println("Game Console is turned ON. Loading your favorite game...");
    }

    @Override
    public void off() {
        System.out.println("Game Console is turned OFF. Game session ended.");
    }
}
