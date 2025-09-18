package com.xworkz.computerapp;

import com.xworkz.computerapp.impl.DesktopComputerImpl;
import com.xworkz.computerapp.impl.LaptopComputerImpl;
import com.xworkz.computerapp.impl.ServerComputerImpl;

public class ComputerRunner {
    public static void main(String[] args) {

        Switch computer1 = new DesktopComputerImpl();
        computer1.on();
        computer1.off();

        Switch computer2 = new LaptopComputerImpl();
        computer2.on();
        computer2.off();

        Switch computer3 = new ServerComputerImpl();
        computer3.on();
        computer3.off();
    }
}

