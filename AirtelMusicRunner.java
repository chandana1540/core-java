class AirtelMusicRunner {
     public static void main(String music[]){
		 boolean isuserRegistered = AirtelMusic.RegisterUser(4,"Chandana","Beliver",10,"chand34@gmail.com");
		 if(isuserRegistered)
			 AirtelMusic.getRegisterDetails();
		 System.out.println("The user is registered "+isuserRegistered);
	 }
}