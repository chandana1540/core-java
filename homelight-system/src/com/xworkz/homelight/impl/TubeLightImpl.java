package com.xworkz.homelight.impl;

import com.xworkz.homelight.Light;

public class TubeLightImpl implements Light {

    @Override
    public void on() {
        System.out.println("TubeLight is ON. Bright white light glowing.");
    }

    @Override
    public void off() {
        System.out.println("TubeLight is OFF. No light.");
    }
}
