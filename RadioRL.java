class RadioRL {
	static String  brand = "HP";
    static int  price = 1049;
    static String antennaSystem = "Telescopic Antenna";
    static String tunerBands = "FM, MW"; 
	static String controls	= "Volume Control";
	static String powerSupply = "Battery";
	static int batteries = 2;
		
	public static void main (String radio[]) {
		System.out.println("main started");
		System.out.println("the brand of radio is "+brand);
		System.out.println("the price of radio is "+price);
		System.out.println("the antennaSystem of radio is "+antennaSystem);
		System.out.println("the tunerBands of radio is "+tunerBands);
		System.out.println("the controls of radio is "+controls);
		System.out.println("the powerSupply of radio is "+powerSupply);
		System.out.println("the batteries  of radio is "+batteries);
		System.out.println("main ended");
	}
}