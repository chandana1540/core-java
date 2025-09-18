package com.xworkz.entertainmentapp;

import com.xworkz.entertainmentapp.impl.GameConsoleImpl;
import com.xworkz.entertainmentapp.impl.RadioImpl;
import com.xworkz.entertainmentapp.impl.SpeakerImpl;

public class EntertainmentRunner {
    public static void main(String[] args) {

        EntertainmentDevice radio = new RadioImpl();
        radio.on();
        radio.off();

        EntertainmentDevice speaker = new SpeakerImpl();
        speaker.on();
        speaker.off();

        EntertainmentDevice gameConsole = new GameConsoleImpl();
        gameConsole.on();
        gameConsole.off();
    }
}

