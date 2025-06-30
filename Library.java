class Library {
	static String bookNames[] = {"TheMidnightLibrary","TheInvisibleLibrary","JaneEyre","1984","PrideAndPreJudice","NameOftheRose","BuildingBooks","TwinkleStar"};
	public static void main(String Library[]) {
		//System.out.println("The Number Of bookNames Are "+bookNames.length);
		//System.out.println(bookNames[0]+" "+bookNames[1]+" "+bookNames[2]+" "+bookNames[3]+" "+bookNames[4]+" "+bookNames[5]+" "+bookNames[6]+" "+bookNames[7]);
	    System.out.println("Main Started");
		System.out.println("Some of the books available in the library are:");
		for ( String bookName : bookNames) {
			System.out.println(bookName);
	}
	    System.out.println("Main Ended");
}
}

