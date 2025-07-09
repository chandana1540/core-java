class Mixer {
 
   static int currentSpeed;
   static int maxSpeed = 3;
   static boolean isConnected;
   static int minSpeed = 0;
   //onOrOff
   public static void onOrOff(){
	   if (isConnected == false){
		   isConnected = true;
		   System.out.println("The mixer is turned on");
	   } else  {
		   isConnected = false;
		   System.out.println("The mixer is turned of ");
	   }
   }
   //increaseSpeed
   public static void increaseSpeed(){
	   if (isConnected = true ) {
		   if(currentSpeed < maxSpeed) {
			   currentSpeed = currentSpeed+1;
			   System.out.println("the current speed is "+currentSpeed);
		   } else {
                System.out.println("the max speed reached");
		   } 
		   }else {
			   System.out.println("switch on the mixer");
		   }
	   }
   //decreaseSpeed
   public static void decreaseSpeed() {
	   if (isConnected = true) {
		   if (currentSpeed > minSpeed) {
			   currentSpeed = currentSpeed-1;
			   System.out.println("the current speed is "+currentSpeed);
		   } else {
			   System.out.println("the minumum speed reached");
		   } 
		   }else {
			   System.out.println("Switch on the mixer");
		   }
	   }
   }
			   
	   
   
  