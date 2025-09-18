package com.xworkz.laptopapp;

import com.xworkz.laptopapp.Impl.DellImpl;
import com.xworkz.laptopapp.Impl.HpImpl;
import com.xworkz.laptopapp.Impl.LenevoImpl;

public class LaptopRunner {
    public static void main(String[] args) {
        Switch switch0 = new DellImpl();
        switch0.on();
        switch0.off();

        Switch switch1 = new HpImpl();
        switch1.on();
        switch1.off();

        Switch switch2 = new LenevoImpl();
        switch2.on();
        switch2.off();
    }
}
