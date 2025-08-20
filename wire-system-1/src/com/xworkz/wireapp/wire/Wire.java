package com.xworkz.wireapp.wire;

public class Wire {
    int wireId;
    String wireBrand;
    double wireCost;
    String purpose;

    Wire(int wireId, String wireBrand, double wireCost, String purpose){
        this.wireId = wireId;
        this.wireBrand = wireBrand;
        this.wireCost = wireCost;
        this.purpose = purpose;
    }

    public void getWireInfo(){
        System.out.println("wireId: "+wireId);
        System.out.println("wireBrand: "+wireBrand);
        System.out.println("wireCost: "+wireCost);
        System.out.println("purpose: "+purpose);


    }


}
