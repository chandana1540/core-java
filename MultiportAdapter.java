class MultiportAdapter {
	static String  brand = "Apple";
    static String  colour = "White";
    static String compatibleDevices =	"Projector";
    static String connectorType =	"VGA, USB Type C";
	static String itemWeight = "40g";
	static String modelNumber =	"MJ1L2ZM/A";
	static String itemDimensionsLxWxH = "15.5 x 8.2 x 1.7 Centimeters";
		
	public static void main (String adapter[]) {
		System.out.println("main started");
		System.out.println("the brand of adapter is "+brand);
		System.out.println("the colour of adapter is "+colour);
		System.out.println("the compatibleDevices of adapter is "+compatibleDevices);
		System.out.println("the connectorType of adapter is "+connectorType);
		System.out.println("the itemWeight of adapter is "+itemWeight);
		System.out.println("the modelNumber of adapter is "+modelNumber);
		System.out.println("the  itemDimensionsLxWxH of adapter is "+itemDimensionsLxWxH);
		System.out.println("main ended");
	}
}