package com.xworkz.mobileapp;

import com.xworkz.mobileapp.Impl.AppleImpl;
import com.xworkz.mobileapp.Impl.OppoImpl;
import com.xworkz.mobileapp.Impl.RedMeImpl;

public class MobileRunner {
    public static void main(String[] args) {
        Switch switch0 = new AppleImpl();
        switch0.switchOn();
        switch0.switchOff();

        Switch switch1 = new OppoImpl();
        switch1.switchOn();
        switch1.switchOff();

        Switch switch2 = new RedMeImpl();
        switch2.switchOn();
        switch2.switchOff();
    }
}
