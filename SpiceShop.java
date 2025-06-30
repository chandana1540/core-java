class SpiceShop {
	static String spices[] = {"Coriander","Cumin","MustardSeeds","BlackPeeper","Cardamon","Cinnamom","Cloves","Nutmeg","FennelSeeds","BaySeeds","StarAnise","Saffron","CaromSeeds","Turmic","RedChilli","GaramMasala"};
	public static void main(String spiceshop[]) {
		//System.out.println("The Number Of spices Are "+spices.length);
		//System.out.println(spices[0]+" "+spices[1]+" "+spices[2]+" "+spices[3]+" "+spices[4]+" "+spices[5]+" "+spices[6]+" "+spices[7]+" "+spices[8]+" "+spices[9]+" "+spices[10]+" "+spices[11]+" "+spices[12]);
	    System.out.println("Main Started");
		System.out.println("The spices are available in the Spices Shop are:");
		for (String spice : spices) {
			System.out.println(spice);
		}
		System.out.println("Main ended");
		
	}
}