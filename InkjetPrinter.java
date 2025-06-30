class InkjetPrinter {
	static String  brand = "Canon";
    static int  price = 3365;
    static String modelName = "MG2570S"; 
    static String modelSeries = "PixmatunerBands"; 
	static String functions = "Print, Copy, Scan";
	static String printingMethod = "Inkjet";
	static String refillType = "Ink Cartridge";
	
	public static void main (String Printer[]) {
		System.out.println("main started");
		System.out.println("the brand of Printer is "+brand);
		System.out.println("the price of Printer is "+price);
		System.out.println("the modelName of Printer is "+modelName);
		System.out.println("the modelSeries of Printer is "+modelSeries);
		System.out.println("the functions of Printer is "+functions);
		System.out.println("the printingMethod of Printer is "+printingMethod);
		System.out.println("the refillType  of Printer is "+refillType);
		System.out.println("main ended");
	}
}