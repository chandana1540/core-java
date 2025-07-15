class AirtelMusicRunner {
	static int userID;
	static String userName;
	static String songTitle;
	static int downloadCount;
	static String email;
	public static boolean RegisterUser(int id, String uName, String sTitle, int dCount, String mail){
		boolean isUserRegistered = false;
		boolean isuserValidated = AirtelMusicValidation.ValidateAirtelMusicUser(id,uName,sTitle,dCount,mail);
		if(isuserValidated == true){
		isUserRegistered = true;
		} else System.out.println("The user is not done with validation and registeration");
		
		return isUserRegistered;
	    }
		
		

        public static void getRegisterDetails(){
			userID = AirtelMusicValidation.userID;
            userName = AirtelMusicValidation.userName;
            songTitle = AirtelMusicValidation.songTitle;
            downloadCount = AirtelMusicValidation.downloadCount;
            email = AirtelMusicValidation.email;

			System.out.println("The UserId is "+userID);
			System.out.println("The UserName is "+userName);
			System.out.println("The SongTitle is "+songTitle);
			System.out.println("The DownloadCount is "+downloadCount);
			System.out.println("The email is "+email);
		}

     public static void main(String music[]){
		 boolean ref = AirtelMusicValidation.ValidateAirtelMusicUser(4,"Chandana","Beliver",10,"chand34@gmail.com");
		 if(ref)
	     getRegisterDetails();
		 System.out.println("The user is registered "+ref);
	 }
}