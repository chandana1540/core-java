package com.xworkz.coolerapp.cooler;

public class Cooler {
    private String coolerLength;
    public void setCoolerLength(String coolerLength) {
        this.coolerLength = coolerLength;
    }
    public String getCoolerLength() {
        return coolerLength;
    }

    private int coolerPrice;

    public void setCoolerPrice(int coolerPrice) {
        this.coolerPrice = coolerPrice;
    }
    public int getCoolerPrice() {
        return coolerPrice;
    }

    private String quality;

    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getQuality() {
        return quality;
    }
    private double weight;
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void getCoolerInfo(){
        System.out.println("coolerLength: "+coolerLength);
        System.out.println("coolerPrice: "+coolerPrice);
        System.out.println("quality: "+quality);
        System.out.println("weight: "+weight);
    }
}
