package com.xworkz.geaserapp;

import com.xworkz.geaserapp.Impl.GasGeaser;
import com.xworkz.geaserapp.Impl.InstantGeaser;
import com.xworkz.geaserapp.Impl.StorageGeaser;

public class GeaserRunner {
    public static void main(String[] args) {
        Switch button = new GasGeaser();
        button.on();
        button.off();

        Switch button1 = new InstantGeaser();
        button1.on();
        button1.off();

        Switch button2 = new StorageGeaser();
        button2.on();
        button2.off();
    }
}
