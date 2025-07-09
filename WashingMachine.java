class WashingMachine {
	static int minSpeed=0;
	static int maxSpeed=2;
	static boolean isPoweredOn;
	static int currentSpeed;
	public static void onOrOff(){
		if(isPoweredOn==false){
		isPoweredOn=true;
		System.out.println("The powerButton is on");
		}
		else{
		isPoweredOn=false;
		System.out.println("The powerButton is of");
		}
	}
	public static void increaseSpeed() {
		if(isPoweredOn = true){
			
		   if(currentSpeed<maxSpeed){
		   currentSpeed=currentSpeed+1;
		   System.out.println("The currentSpeed is "+currentSpeed);
		   }
		   else{
			System.out.println("The maxspeed of washing machine reached its limit");
		   }
		}
	    else{
		System.out.println("click the button on");
        }
    }
	public static void decreaseSpeed() {
		if(isPoweredOn = true){
			
		   if(currentSpeed>minSpeed){
		   currentSpeed=currentSpeed-1;
		   System.out.println("The currentSpeed is "+currentSpeed);
		   }
		   else{
			System.out.println("The minspeed of washing machine reached its limit");
		   }
		}
	    else{
		System.out.println("click the button on");
        }
    }
	}
		
	
	