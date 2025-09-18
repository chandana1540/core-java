package com.xworkz.musicplayerapp;


import com.xworkz.musicplayerapp.impl.AppleMusicPlayerImpl;
import com.xworkz.musicplayerapp.impl.GooglePlayMusicPlayerImpl;
import com.xworkz.musicplayerapp.impl.SpotifyPlayerImpl;

public class MusicPlayerRunner {
    public static void main(String[] args) {

        Switch player1 = new SpotifyPlayerImpl();
        player1.on();
        player1.off();

        Switch player2 = new AppleMusicPlayerImpl();
        player2.on();
        player2.off();

        Switch player3 = new GooglePlayMusicPlayerImpl();
        player3.on();
        player3.off();
    }
}

