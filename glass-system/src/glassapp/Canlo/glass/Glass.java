package glassapp.Canlo.glass;

public class Glass {
    String glassType;
    String glassDesign;
    int noOfGlass;
    double glassWeight;
    boolean isTransparent;

    Glass(String glassType, String glassDesign, int noOfGlass, double glassWeight, boolean isTransparent){
        this.glassType = glassType;
        this.glassDesign = glassDesign;
        this.noOfGlass = noOfGlass;
        this.glassWeight = glassWeight;
        this.isTransparent = isTransparent;
    }
    public void getGlassInfo(){
        System.out.println("glassType: "+glassType);
        System.out.println("glassDesign: "+glassDesign);
        System.out.println("noOfGlass: "+noOfGlass);
        System.out.println("glassWeight: "+glassWeight);
        System.out.println("isTransparent: "+isTransparent);

    }
}
