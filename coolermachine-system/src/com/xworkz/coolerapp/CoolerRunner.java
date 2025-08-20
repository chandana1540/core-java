package com.xworkz.coolerapp;

import com.xworkz.coolerapp.cooler.Cooler;

public class CoolerRunner {
    public static void main(String[] args) {
        Cooler cooler = new Cooler();//cooler-reference variable.
        cooler.setCoolerLength("34 cms");
        cooler.getCoolerLength();
        cooler.setCoolerPrice(34000);
        cooler.getCoolerPrice();
        cooler.setQuality("good");
        cooler.getQuality();
        cooler.setWeight(34.59);
        cooler.getWeight();
        cooler.getCoolerInfo();
    }

}
