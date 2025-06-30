class City {
	static String pinCodes[] = {"560001","560002","560003","560004","560005","560006","560007","560008","560009","560010","560011","560012","560013"};
	public static void main(String city[]) {
		//System.out.println("The Number Of pinCodes Are "+pinCodes.length);
		//System.out.println(pinCodes[0]+" "+pinCodes[1]+" "+pinCodes[2]+" "+pinCodes[3]+" "+pinCodes[4]+" "+pinCodes[5]+" "+pinCodes[6]+" "+pinCodes[7]+" "+pinCodes[8]+" "+pinCodes[9]+" "+pinCodes[10]+" "+pinCodes[11]+" "+pinCodes[12]);
	    System.out.println("Main Started");
		System.out.println("The PinCodes in Banglore Available are:");
		for ( String pincode : pinCodes) {
			System.out.println(pincode);
	}
	    System.out.println("Main Ended");
}
}