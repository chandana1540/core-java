package com.xworkz.wireapp.wire;

public class WireRunner {


    public static void main(String[] args) {

        Wire wire = new Wire(3, "Castle", 243.30,"Alternate Connection");
        System.out.println("Main Started");
        wire.getWireInfo();
        System.out.println("Main Ended");
    }
}
