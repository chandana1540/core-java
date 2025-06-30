class Ipl {
	 static String teamNames[] = {"RCB","CSK","RR","SRH","KKR","LSG","DC","GT","MI","PBKS"};
	public static void main(String cricket[]) {
		//System.out.println("The Number Of teamNames Are "+teamNames.length);
		//System.out.println(teamNames[0]+" "+teamNames[1]+" "+teamNames[2]+" "+teamNames[3]+" "+teamNames[4]+" "+teamNames[5]+" "+teamNames[6]+" "+teamNames[7]+" "+teamNames[8]+" "+teamNames[9]);
	    System.out.println("Main Started");
		System.out.println("The TeamNames available in IPL are:");
		for(String teamName : teamNames) {
			System.out.println(teamName);
	}
	    System.out.println("Main Ended");
}
}
