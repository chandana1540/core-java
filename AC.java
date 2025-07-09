class AC {
	   static int currentTemperature;
	   static int maximumTemperature = 4;
	   static int minimumTemperature = 0;
	   static boolean isSwitched;
   
	   
	   // onOrOff
	   
	   public static void onOrOff(){
		   if(isSwitched ==false) {
			  isSwitched = true;
			  System.out.println("The AC is Switched On");
		   }else {
			   isSwitched = false;
			   System.out.println("The AC is Switched Of");
		   }
	   }
	   
		// increaseTemperature
 
        public static void increaseTemperature(){
			if(isSwitched = true) {
				if(currentTemperature < maximumTemperature){
				currentTemperature = currentTemperature+1;
				System.out.println("The currentTemperature of AC is "+currentTemperature);
				}
				else{
				System.out.println("The maximumTemperature Reached");
				}
			}
			else {
				System.out.println("Switch on the AC");
			}
			}
			
		// decreaseTemperature
		
		public static void decreaseTemperature(){
			if(isSwitched = true){
				if(currentTemperature>minimumTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("The currentTemperature of AC is "+currentTemperature);
				} 
				else{
				System.out.println("The minimumTemperature reached");
                }
            }				
			else{
			System.out.println("The AC is Switched on");
			}
			}
            }
		
					
				