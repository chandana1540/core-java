class Signal{
     static int noOfSignals;
	 static String type;
	 static float length;
	 static byte range;
	 static boolean isTraffic;
	 
	 public static int getNoOfSignals(){
		 noOfSignals = 3;
		 return noOfSignals;
	 }
	 public static String getType(){
		 type = "traffic";
		 return type;
	 }
	 public static float getLength(){
		 length = 4.5f;
		 return length;
	 }
	 public static byte getRange(){
		 range = 124;
		 return range;
	 }
	 public static boolean getIsTraffic(){
		 isTraffic = true;
		 return isTraffic;
	 }
}
