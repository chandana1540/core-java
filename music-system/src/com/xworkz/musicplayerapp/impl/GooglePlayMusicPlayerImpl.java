package com.xworkz.musicplayerapp.impl;

import com.xworkz.musicplayerapp.Switch;

public class GooglePlayMusicPlayerImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Google Play Music Player is switched ON and playing music.");
    }

    @Override
    public void off() {
        System.out.println("Google Play Music Player is switched OFF and stopped playing.");
    }
}


