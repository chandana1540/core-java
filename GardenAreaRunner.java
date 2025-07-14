class GardenAreaRunner {
public static void main(String garden[]){

String gardenName = GardenArea.getGardenname();
System.out.println("The gardenName is "+gardenName);

int bench = GardenArea.getBench();
System.out.println("The total bench of this garden is "+bench);

double trees = GardenArea.getTrees();
System.out.println("The no of trees in garden is "+trees);

byte size =  GardenArea.getSize();
System.out.println("The size of this garden is "+size);

boolean isGardened = GardenArea.getIsGardened();
System.out.println("The area isGardened "+isGardened);
}
}
