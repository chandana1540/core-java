class Projector {
	static int minVolume = 0;
	static int maxVolume = 3;
	static boolean isSwitchedOn;
	static int currentVolume;
	
	public static void onOrOff(){
		if(isSwitchedOn == false){
		isSwitchedOn = true;
		System.out.println("The Projector is Switched on");
		}
		else {
		isSwitchedOn = false;
		System.out.println("The projector is Switched off");
        }		
	}
    public static void increaseVolume(){
		if(isSwitchedOn = true){
			if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("the currentVolume of projector is "+currentVolume);
			}
			else{
			System.out.println("the maxVolume is maximised in projector");
			}
		}
		else{
			System.out.println("Switch on a projector");
		}
	}
	public static void decreaseVolume(){
		if(isSwitchedOn = true){
			if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("the currentVolume of projector is "+currentVolume);
			}
			else{
			System.out.println("the minVolume is maximised in projector");
			}
		}
		else{
			System.out.println("Switch on a projector");
		}
		}
	}
		
        		