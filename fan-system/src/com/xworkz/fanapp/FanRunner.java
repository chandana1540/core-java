package com.xworkz.fanapp;

import com.xworkz.fanapp.impl.HawelImpl;
import com.xworkz.fanapp.impl.PrestigeImpl;

public class FanRunner {
    public static void main(String[] args) {
        Plug plug = new HawelImpl();
        plug.plugOn();
        plug.plugOff();

        Plug plug1 = new PrestigeImpl();
        plug1.plugOn();
        plug1.plugOff();

        Plug plug2 = new HawelImpl();
        plug2.plugOn();
        plug2.plugOff();
    }
}
