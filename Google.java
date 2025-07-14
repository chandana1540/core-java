class Google{
	static String fullName;
	static String dateOfBirth;
	static int age;
	static String password;
	static String confirmPassword;
	
	public static boolean createUser(String fName, String DOB, int Age, String pWd, String cPwd){
		boolean isUserCreated = false;
		boolean fullNameValid = false;
		boolean dateOfBirthValid = false;
		boolean ageValid = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		
		if(fName!=null){
			fullName=fName;
			fullNameValid = true;
		} else System.out.println("fullname is not a valid");
		
		if(DOB!=null){
			dateOfBirth= DOB;
			dateOfBirthValid = true;
		} else System.out.println("The DOB is not a valid");
		
		if(Age!=0){
			age = Age;
			ageValid = true;
		} else System.out.println("The age is not valid");
		
		if(pWd!=null) {
			password = pWd;
			passwordValid = true;
		}else System.out.println("The password is not valid");
		
		if(cPwd!=null && pWd==cPwd){
			confirmPassword = cPwd;
			confirmPasswordValid = true;
		}else System.out.println("The confirmPassword is not same as password"); 
		
		if(fullNameValid && dateOfBirthValid  && ageValid && passwordValid && confirmPasswordValid){
			isUserCreated = true;
		}else System.out.println("The isUserCreated is not valid");
		return isUserCreated;
	    }
	public static void getCreateUserInfo(){
		System.out.println("The FullName entered in Google is "+fullName);
		System.out.println("The Date of Birth  is "+dateOfBirth);
		System.out.println("The Age of creating User is "+age);
		System.out.println("The password is "+password);
		System.out.println("The confirmPassword is "+confirmPassword);
	}
}

	