class Ipl {
	static int pinCodes[] = {560001,560002,560003,560004};
	
	public static void main(String args[]) {
		System.out.println("main started");
		System.out.println("Are pincodes available are:");
		for(int pinCode : pinCodes) {
			System.out.println(pinCode);
		}
	}
}
