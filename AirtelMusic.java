class AirtelMusic {
	static int userID;
	static String userName;
	static String songTitle;
	static int downloadCount;
	static String email;
	public static boolean RegisterUser(int id, String uName, String sTitle, int dCount, String mail){
		boolean isuserRegistered = false;
		boolean userIDValid = false;
		boolean userNameValid = false;
		boolean songTitleValid = false;
		boolean downloadCountValid = false;
		boolean emailValid = false;
		
		if(id!=0){
			userID = id;
			userIDValid = true;
		} else System.out.println("The userId is not valid");
		
		if(uName!=null){
			userName = uName;
			userNameValid = true;
		} else System.out.println("The userName is not valid");
		
		if(sTitle!=null){
			songTitle = sTitle;
			songTitleValid = true;
		} else System.out.println("The songTitle is not Valid");
		
		if(dCount!=0){
			downloadCount = dCount;
			downloadCountValid = true;
		} else System.out.println("The downloadCount is not valid");
		
		if(mail!=null){
			email = mail;
			emailValid = true;
		} else System.out.println("The email is not valid");
		
		if(userIDValid && userNameValid && songTitleValid && downloadCountValid && emailValid){
			isuserRegistered = true;
		} else System.out.println("The userRegistered is not valid");
		return isuserRegistered;
	}
	
        public static void getRegisterDetails(){
			System.out.println("The UserId is "+userID);
			System.out.println("The UserName is "+userName);
			System.out.println("The SongTitle is "+songTitle);
			System.out.println("The DownloadCount is "+downloadCount);
			System.out.println("The email is "+email);
		}
}