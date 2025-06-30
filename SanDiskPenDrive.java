class SanDiskPenDrive {
	static String  brand = "SanDisk";
    static String capacity	= "16 GB";
    static String hardwareInterface	= "USB 2.0";
    static String compatibleDevices = "Laptop, Desktop";
	static int price	= 319;
	static String readSpeed = "100 megabytes per second";
	static String writeSpeed	= "1x";
	public static void main (String pendrive[]) {
		System.out.println("main started");
		System.out.println("the brand of pendrive is "+brand);
		System.out.println("the  capacity of pendrive is "+capacity);
		System.out.println("the hardwareInterface of pendrive is "+hardwareInterface);
		System.out.println("the compatibleDevices of pendrive is "+compatibleDevices);
		System.out.println("the price of pendrive is "+price);
		System.out.println("the readSpeed of pendrive is "+readSpeed);
		System.out.println("the writeSpeed  of pendrive is "+writeSpeed);
		System.out.println("main ended");
	}
}