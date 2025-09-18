package com.xworkz.gamingconsoleapp;

import com.xworkz.gamingconsoleapp.impl.NintendoSwitchImpl;
import com.xworkz.gamingconsoleapp.impl.PlayStationImpl;
import com.xworkz.gamingconsoleapp.impl.XboxImpl;

public class GamingConsoleRunner {
    public static void main(String[] args) {

        Switch console1 = new PlayStationImpl();
        console1.on();
        console1.off();

        Switch console2 = new XboxImpl();
        console2.on();
        console2.off();

        Switch console3 = new NintendoSwitchImpl();
        console3.on();
        console3.off();
    }
}
