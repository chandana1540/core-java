package com.xworkz.projectorapp;

import com.xworkz.projectorapp.impl.DLPProjectorImpl;
import com.xworkz.projectorapp.impl.LCDProjectorImpl;
import com.xworkz.projectorapp.impl.LaserProjectorImpl;

public class ProjectorRunner {
    public static void main(String[] args) {

        Switch projector1 = new LCDProjectorImpl();
        projector1.on();
        projector1.off();

        Switch projector2 = new DLPProjectorImpl();
        projector2.on();
        projector2.off();

        Switch projector3 = new LaserProjectorImpl();
        projector3.on();
        projector3.off();
    }
}

