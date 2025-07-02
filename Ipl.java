class Ipl {
	
	 static String rcb = "RCB";
	 static String csk = "CSK";
	 static String rr  = "RR";
	 static String srh = "SRH";
	 static String kkr = "KKR";
	 static String lsg = "LSG";
	 static String dc = "DC";
	 static String gt = "GT";
	 static String mi = "MI";
	 static String pbks = "PBKS";
	 
	 static String teamNames[] = {rcb,csk,rr,srh,kkr,lsg,dc,gt,mi,pbks};
	public static void main(String cricket[]) {
		//System.out.println("The Number Of teamNames Are "+teamNames.length);
		//System.out.println(teamNames[0]+" "+teamNames[1]+" "+teamNames[2]+" "+teamNames[3]+" "+teamNames[4]+" "+teamNames[5]+" "+teamNames[6]+" "+teamNames[7]+" "+teamNames[8]+" "+teamNames[9]);
	    System.out.println("Main Started");
		
	  String rcb = "RCB";
	  String csk = "CSK";
	  String rr  = "RR";
      String srh = "SRH";
	  String kkr = "KKR";
	  String lsg = "LSG";
	  String dc = "DC";
	  String gt = "GT";
	  String mi = "MI";
	  String pbks = "PBKS";
		System.out.println("The TeamNames available in IPL are:");
		for(String teamName : teamNames) {
			System.out.println(teamName);
	}
	    System.out.println("Main Ended");
}
}
