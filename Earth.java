class Earth {
	static String asia = "Asia";
	static String africa = "Africa";
	static String northAmerica = "NorthAmerica";
	static String southAmerica = "SouthAmerica";
	static String antaractica = "Antaractica";
	static String europe = "Europe";
	static String australia = "Australia";
	
	static String continents[] = {asia,africa,northAmerica,southAmerica,antaractica,europe,australia};
	
	public static void main (String earth[]) {
		//System.out.println("The Number Of continents Are "+continents.length);
		//System.out.println(continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);
	    System.out.println("Main Started");
		
	String asia = "Asia";
	String africa = "Africa";
	String northAmerica = "NorthAmerica";
	String southAmerica = "SouthAmerica";
	String antaractica = "Antaractica";
	String europe = "Europe";
	String australia = "Australia";
		
		
		System.out.println("There are Seven Continents in Earth: ");
		for ( String continent : continents) {
			System.out.println(continent);
		}
			
		System.out.println("Main Ended");
	}
}

