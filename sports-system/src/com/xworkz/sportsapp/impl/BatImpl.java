package com.xworkz.sportsapp.impl;

import com.xworkz.sportsapp.SportsEquipment;

public class BatImpl implements SportsEquipment {

    @Override
    public void on() {
        System.out.println("Bat is ready. Player starts batting.");
        }
        @Override
        public void off() {
            System.out.println("Batting stopped. Bat is kept aside.");
        }
    }

