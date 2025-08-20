package com.xworkz.networkapp;

import com.xworkz.networkapp.airtel.AirtelNetwork;

public class NetRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        AirtelNetwork network = new AirtelNetwork();
        //network.networkId = 2;
        //network.networkName = "Airtel";
        //System.out.println("networkid :"+network.networkId);
        //System.out.println("networkid :"+network.networkName);
        System.out.println("Main Ended");
        network.setNetworkId(3);
        network.getNetworkId();
        System.out.println("networkid :"+network.getNetworkId());


    }
}
