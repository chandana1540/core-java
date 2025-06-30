class Bar {
	static String alcoholNames[] = {"Beer","Wine","Whiskey","Vodka","Gin","Rum","Brandy","PalmWine","ElderBerryWine","PomeGranateWine","BlueberryWine","RasberryWine"};
	public static void main(String bar[]) {
		//System.out.println("The Number Of alcoholNames Are "+alcoholNames.length);
		//System.out.println(alcoholNames[0]+" "+alcoholNames[1]+" "+alcoholNames[2]+" "+alcoholNames[3]+" "+alcoholNames[4]+" "+alcoholNames[5]+" "+alcoholNames[6]+" "+alcoholNames[7]+" "+alcoholNames[8]+" "+alcoholNames[9]+" "+alcoholNames[10]+" "+alcoholNames[11]);
	    System.out.println("Main Started");
		System.out.println("Some of the Alcohol names are:");
		for (String alcoholName : alcoholNames) {
			System.out.println(alcoholName);
		}
		System.out.println("Main Ended");
	}
}