class Cooler {
	static int minSpeed=0;
	static int maxSpeed=4;
	static boolean isTurnedOn;
	static int currentSpeed;
	public static void onOrOff(){
		if(isTurnedOn==false){
		isTurnedOn=true;
		System.out.println("The powerButton is on");
		}
		else{
		isTurnedOn=false;
		System.out.println("The powerButton is of");
		}
	}
	public static void increaseSpeed() {
		if(isTurnedOn = true){
			
		   if(currentSpeed<maxSpeed){
		   currentSpeed=currentSpeed+1;
		   System.out.println("The currentSpeed is "+currentSpeed);
		   }
		   else{
			System.out.println("The maxspeed of cooler reached ");
		   }
		}
	    else{
		System.out.println("click the on button");
        }
    }
	public static void decreaseSpeed() {
		if(isTurnedOn = true){
			
		   if(currentSpeed>minSpeed){
		   currentSpeed=currentSpeed-1;
		   System.out.println("The currentSpeed is "+currentSpeed);
		   }
		   else{
			System.out.println("The minspeed of cooler reached");
		   }
		}
	    else{
		System.out.println("click the on button");
        }
    }
	}