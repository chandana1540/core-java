package com.xworkz.sportsapp.impl;

import com.xworkz.sportsapp.SportsEquipment;

public class BallImpl implements SportsEquipment {

    @Override
    public void on() {
        System.out.println("Ball is in play. Bowler delivers the ball.");
    }

    @Override
    public void off() {
        System.out.println("Ball is out of play. Game paused.");
    }
}