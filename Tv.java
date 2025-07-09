class Tv{
	static int maxVolume=10;
	static int minVolume=0;
	static int currentVolume;
	static boolean isButtonOn;
	
	public static void onOrOff(){
		if(isButtonOn==false){
		isButtonOn=true;
		System.out.println("the Tv is turned on");
		}
		else{
		isButtonOn=false;
		System.out.println("the tv is turned off");
		}
	}
	public static void increaseVolume(){
		if(isButtonOn=true){
			if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("The currentVolume of Tv is "+currentVolume);
			}
			else{
			System.out.println("the maxVolume of tv is reached");
			}
		}
		else{
		System.out.println("tv akro");
		}
	}
	public static void decreaseVolume(){
		if(isButtonOn=true){
			if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("The currentVolume of Tv is "+currentVolume);
			}
			else{
			System.out.println("the minVolume of tv is reached");
			}
		}
		else{
		System.out.println("tv akro");
		}
	}
}
	
		
		