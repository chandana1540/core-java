package bulbapp.xworkz.bulb;

public class Bulb {
    String bulbBrand;
    String bulbType;
    int bulbId;
    double bulbPrice;

    Bulb(String bulbBrand, String bulbType, int bulbId, double bulbPrice ){
        this.bulbBrand = bulbBrand;
        this.bulbType = bulbType;
        this.bulbId = bulbId;
        this.bulbPrice = bulbPrice;
    }

    public void getBulbInfo(){
        System.out.println("bulbBrand: "+bulbBrand);
        System.out.println("bulbType: "+bulbType);
        System.out.println("bulbId: "+bulbId);
        System.out.println("bulbPrice: "+bulbPrice);

    }
}
