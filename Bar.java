class Bar {
	static String beer = "Beer";
	static String wine = "Wine";
	static String whiskey = "Whiskey";
	static String vodka = "Vodka";
	static String gin = "Gin";
	static String rum = "Rum";
	static String brandy = "Brandy";
	static String palmWine = "PalmWine";
	static String elderBerryWine = "ElderBerryWine";
	static String pomeGranateWine = "PomeGranateWine";
	static String blueberryWine = "BlueberryWine";
	static String rasberryWine = "RasberryWine";
	static String alcoholNames[] = {beer,wine,whiskey,vodka,gin,rum,brandy,palmWine,elderBerryWine,pomeGranateWine,blueberryWine,rasberryWine};
	public static void main(String bar[]) {
		//System.out.println("The Number Of alcoholNames Are "+alcoholNames.length);
		//System.out.println(alcoholNames[0]+" "+alcoholNames[1]+" "+alcoholNames[2]+" "+alcoholNames[3]+" "+alcoholNames[4]+" "+alcoholNames[5]+" "+alcoholNames[6]+" "+alcoholNames[7]+" "+alcoholNames[8]+" "+alcoholNames[9]+" "+alcoholNames[10]+" "+alcoholNames[11]);
	    System.out.println("Main Started");
	String beer = "Beer";
	String wine = "Wine";
	String whiskey = "Whiskey";
	String vodka = "Vodka";
	String gin = "Gin";
	String rum = "Rum";
	String brandy = "Brandy";
	String palmWine = "PalmWine";
	String elderBerryWine = "ElderBerryWine";
	String pomeGranateWine = "PomeGranateWine";
	String blueberryWine = "BlueberryWine";
	String rasberryWine = "RasberryWine";
		System.out.println("Some of the Alcohol names are:");
		for (String alcoholName : alcoholNames) {
			System.out.println(alcoholName);
		}
		System.out.println("Main Ended");
	}
}