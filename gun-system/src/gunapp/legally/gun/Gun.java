package gunapp.legally.gun;

public class Gun {
    String gunSize;
    int gunLength;
    double gunPrice;
    String gunWeight;

    Gun(String gunSize, int gunLength, double gunPrice, String gunWeight) {
        this.gunSize = gunSize;
        this.gunLength = gunLength;
        this.gunPrice = gunPrice;
        this.gunWeight = gunWeight;
    }

    public void getGunInfo() {
        System.out.println("gunSize: " + gunSize);
        System.out.println("gunLength: " + gunLength);
        System.out.println("gunPrice: " + gunPrice);
        System.out.println("gunWeight:" + gunWeight);

    }

}
