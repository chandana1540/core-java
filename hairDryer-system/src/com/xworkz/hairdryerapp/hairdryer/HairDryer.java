package com.xworkz.hairdryerapp.hairdryer;

public class HairDryer {
    String brand;
    String wattage;
    String color;
    int price;

    HairDryer(String brand, String wattage, String color, int price){
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        this.price = price;
    }
    public void getHairDryerInfo(){
        System.out.println("brand: "+brand);
        System.out.println("wattage: "+wattage);
        System.out.println("color: "+color);
        System.out.println("price: "+price);
    }
}
