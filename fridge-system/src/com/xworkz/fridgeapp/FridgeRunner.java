package com.xworkz.fridgeapp;

import com.xworkz.fridgeapp.Impl.HairImpl;
import com.xworkz.fridgeapp.Impl.SamsungImpl;
import com.xworkz.fridgeapp.Impl.WhirlPoolImpl;

public class FridgeRunner {
    public static void main(String[] args) {
        Switch switch0 = new HairImpl();
        switch0.on();
        switch0.off();

        Switch switch1 = new SamsungImpl();
        switch1.on();
        switch1.off();

        Switch switch2 = new WhirlPoolImpl();
        switch2.on();
        switch2.off();
    }
}
