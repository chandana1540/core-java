class Library {
	static String theMidnightLibrary = "TheMidnightLibrary";
	static String theInvisibleLibrary ="TheInvisibleLibrary";
	static String janeEyre = "JaneEyre";
	static String john = "john";
	static String prideAndPreJudice = "PrideAndPreJudice";
	static String nameOftheRose = "NameOftheRose";
	static String twinkleStar = "TwinkleStar";
	static String buildingBooks = "BuildingBooks";
	
	static String bookNames[] = {theMidnightLibrary,theInvisibleLibrary,janeEyre,john,prideAndPreJudice,nameOftheRose,buildingBooks,twinkleStar};
	public static void main(String Library[]) {
		//System.out.println("The Number Of bookNames Are "+bookNames.length);
		//System.out.println(bookNames[0]+" "+bookNames[1]+" "+bookNames[2]+" "+bookNames[3]+" "+bookNames[4]+" "+bookNames[5]+" "+bookNames[6]+" "+bookNames[7]);
	    System.out.println("Main Started");
	 String theMidnightLibrary = "TheMidnightLibrary";
	 String theInvisibleLibrary ="TheInvisibleLibrary";
	 String janeEyre = "JaneEyre";
	 String john = "john";
	 String prideAndPreJudice = "PrideAndPreJudice";
	 String nameOftheRose = "NameOftheRose";
	 String twinkleStar = "TwinkleStar";
	 String buildingBooks = "BuildingBooks";
		System.out.println("Some of the books available in the library are:");
		for ( String bookName : bookNames) {
			System.out.println(bookName);
	}
	    System.out.println("Main Ended");
}
}

