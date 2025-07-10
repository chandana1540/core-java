class SnapChat {
	static String firstName;
	static String lastName;
	
	public static boolean registerUser(String fName, String lName){
		boolean isUserRegistered =  false;
		boolean firstNameValid = false;
		boolean lastNameValid = false;
		if(fName != null){
			firstName = fName;
			firstNameValid = true;
		}
		if(lName != null){
			lastName = lName;
			lastNameValid = true;
		}
		if(firstNameValid == true && lastNameValid == true){
			isUserRegistered = true;
		}
		return isUserRegistered;
	}
	public static void getUserInfo(){
		System.out.println("The first Name is "+firstName);
        System.out.println("The last Name is "+lastName);
	}
}	
		