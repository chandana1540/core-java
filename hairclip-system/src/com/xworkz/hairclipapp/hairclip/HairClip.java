package com.xworkz.hairclipapp.hairclip;

public class HairClip {
    String clipName;
    int noOfClips;
    double price;
    String clipType;

    HairClip(String clipName, int noOfClips, double price, String clipType){
        this.clipName = clipName;
        this.noOfClips = noOfClips;
        this.price = price;
        this.clipType = clipType;
    }

    public void getHairClipInfo(){
       System.out.println("clipName: "+clipName);
       System.out.println("noOfClips: "+noOfClips);
       System.out.println("price: "+price);
       System.out.println("clipType: "+clipType);
    }


}
