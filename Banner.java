class Banner {
    static String type;
	static short noOfBanners;
	static int length;
	static double clarityRange;
	static boolean isPrinted;
	
	public static String getType(){
	   type = "Poster";
	   return type;
	}
	public static short getBannerNos(){
		noOfBanners = 32400;
		return noOfBanners;
	}
	public static int getLength(){
		length = 7;
		return length;
	}
	public static double getClarityRange(){
		clarityRange = 125;
		return clarityRange;
    }
    public static boolean getPrinted(){
		isPrinted = true;
		return isPrinted;
	}
}
	
