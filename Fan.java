class Fan {
	static int maxSpeed = 3;
	static int minSpeed = 0;
	static boolean switchOn ;
	static int currentSpeed ;
	
	//onOrOff
	public static void onOrOff() {
		if(switchOn == false){
		switchOn = true;
		System.out.println("the fan is switched on");
		}
		else{
		switchOn = false;
		System.out.println("the fan is switched off");
		}
	}
	
	//increaseSpeed
	public static void increaseSpeed() {
		if(switchOn = true){
			
		   if(currentSpeed<maxSpeed){
		   currentSpeed=currentSpeed+1;
		   System.out.println("The currentSpeed is "+currentSpeed);
		}
		   else{
			System.out.println("it reached the maxspeed of fan");
		   }
		}
		
		else{
			System.out.println("switch on a fan");
		}
	}
	//decreaseSpeed
	
	public static void decreaseSpeed(){
		if(switchOn = true){
			if(currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("The currentSpeed of fan is"+currentSpeed);
		}
			else{
			System.out.println("it reached the minSpeed of fan");
			}
		}
		else{
			System.out.println("switch on a fan");
		}
	}
	
	}
				
		
		