class StockMarket {
	static String stockNames[] = {"HDFCBankLtd","InfosysLtd","TCSLtd","ITCLtd","BajajFinanceLtd","KotakMahindraBankLtd","AxisBankLtd","CanaraBankLtd","Toyata","TechMahindra"};
	public static void main(String Market[]) {
		//System.out.println("The Number Of stockNames Are "+stockNames.length);
		//System.out.println(stockNames[0]+" "+stockNames[1]+" "+stockNames[2]+" "+stockNames[3]+" "+stockNames[4]+" "+stockNames[5]+" "+stockNames[6]+" "+stockNames[7]+" "+stockNames[8]+" "+stockNames[9]);
	    System.out.println("Main Started");
		System.out.println("Some of the Stocknames are:");
		for (String stockname : stockNames) {
			System.out.println(stockname);
	}
	    System.out.println("Main Ended");
}
}
