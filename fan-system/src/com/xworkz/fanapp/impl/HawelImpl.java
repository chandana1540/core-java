package com.xworkz.fanapp.impl;

import com.xworkz.fanapp.Plug;

public class HawelImpl implements Plug {
    @Override
    public void plugOn() {
        System.out.println("The Plug of fan is Turned on");
    }

    @Override
    public void plugOff() {
        System.out.println("The Plug of fan is Turned off");

    }
}
