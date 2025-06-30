class Earth {
	static String continents[] = {"Asia","Africa","NorthAmerica","SouthAmerica","Antaractica","Europe","Australia"};
	
	public static void main (String earth[]) {
		//System.out.println("The Number Of continents Are "+continents.length);
		//System.out.println(continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);
	    System.out.println("Main Started");
		System.out.println("There are Seven Continents in Earth: ");
		for ( String continent : continents) {
			System.out.println(continent);
		}
			
		System.out.println("Main Ended");
	}
}

