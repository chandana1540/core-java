package com.xworkz.sportsapp;

import com.xworkz.sportsapp.impl.BallImpl;
import com.xworkz.sportsapp.impl.BatImpl;
import com.xworkz.sportsapp.impl.RacketImpl;

public class SportsRunner {
    public static void main(String[] args) {

        SportsEquipment bat = new BatImpl();
        bat.on();
        bat.off();

        SportsEquipment ball = new BallImpl();
        ball.on();
        ball.off();

        SportsEquipment racket = new RacketImpl();
        racket.on();
        racket.off();
    }
}

