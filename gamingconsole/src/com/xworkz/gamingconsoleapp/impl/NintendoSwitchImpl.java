package com.xworkz.gamingconsoleapp.impl;

import com.xworkz.gamingconsoleapp.Switch;

public class NintendoSwitchImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Nintendo Switch is powered ON. Game mode activated.");
    }

    @Override
    public void off() {
        System.out.println("Nintendo Switch is powered OFF. Exiting game mode.");
    }
}


