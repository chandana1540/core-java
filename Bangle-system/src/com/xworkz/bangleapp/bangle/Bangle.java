package com.xworkz.bangleapp.bangle;

public class Bangle {
    String bangleBrand;
    String size;
    String height;
    String width;
    int price;

    Bangle(String bangleBrand, String size, String height, String width, int price){
        this.bangleBrand = bangleBrand;
        this.size = size;
        this.height = height;
        this.width = width;
        this.price = price;
    }
    public void getBangleInfo(){
        System.out.println("bangleBrand: "+bangleBrand);
        System.out.println("size: "+size);
        System.out.println("height: "+height);
        System.out.println("width: "+width);
        System.out.println("price: "+price);
    }


}
