class Radio{
	static String colour;
	static int buttons;
	static byte speedRange;
	static float volume;
	static boolean isSwitched;
	
	public static String getColour(){
		colour = "White";
		return colour;
	}
	public static  int getButton(){
		buttons = 2;
		return buttons;
	}
	public static byte getSpeedRange(){
		speedRange = 127;
		return speedRange;
	}
	public static float getVolume(){
		volume = 4.3f;
		return volume;
	}
	public static boolean getIsSwitched(){
		isSwitched = true;
		return isSwitched;
	}
}
	
	