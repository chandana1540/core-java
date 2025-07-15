class AirtelMusicValidation {
	static int userID;
	static String userName;
	static String songTitle;
	static int downloadCount;
	static String email;
	
	public static boolean ValidateAirtelMusicUser(int id, String uName, String sTitle, int dCount, String mail){
		boolean isuserValidated = false;
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
			isuserValidated = true;
		} else System.out.println("The userRegistered is not valid");
		return isuserValidated;
	    }
        }