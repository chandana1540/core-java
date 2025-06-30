class PeriodicTable {
	static String elements[] = {"H","Li","Be","Na","Mg","K","Ca","Sc","Ti","V","Cr","Mn"};
	public static void main(String table[]) {
		//System.out.println("The Number Of elements Are "+elements.length);
		//System.out.println(elements[0]+" "+elements[1]+" "+elements[2]+" "+elements[3]+" "+elements[4]+" "+elements[5]+" "+elements[6]+" "+elements[7]+" "+elements[8]+" "+elements[9]+" "+elements[10]+" "+elements[11]);
	    System.out.println("Main Started");
		System.out.println("The elements in PeriodicTable are:");
		for (String element : elements) {
			System.out.println(element); 
		}
		System.out.println("main Ended");
	}
}
