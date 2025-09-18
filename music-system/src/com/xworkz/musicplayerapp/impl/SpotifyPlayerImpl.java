package com.xworkz.musicplayerapp.impl;

import com.xworkz.musicplayerapp.Switch;

public class SpotifyPlayerImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Spotify Player is switched ON and playing music.");
    }

    @Override
    public void off() {
        System.out.println("Spotify Player is switched OFF and stopped playing.");
    }
}


