class GoogleRunner {
	static String fullName;
	static String dateOfBirth;
	static int age;
	static String password;
	static String confirmPassword;
	
	public static boolean createUser(String fName, String DOB, int Age, String pWd, String cPwd){
		boolean isUserCreated = false;
		boolean isUserValidated = GoogleValidation.ValidateGoogleUser(fName,DOB,Age,pWd,cPwd);
		if(isUserValidated ==true){
	    isUserCreated = true;
	    }else System.out.println("The user is not done with validation and registeration");
		return isUserCreated;
        }
	public static void getCreateUserInfo(){	
		fullName = GoogleValidation.fullName;
		dateOfBirth = GoogleValidation.dateOfBirth;
		age = GoogleValidation.age;
		password = GoogleValidation.password;
		confirmPassword = GoogleValidation.confirmPassword;
	
		System.out.println("The FullName entered in Google is "+fullName);
		System.out.println("The Date of Birth  is "+dateOfBirth);
		System.out.println("The Age of creating User is "+age);
		System.out.println("The password is "+password);
		System.out.println("The confirmPassword is "+confirmPassword);
	}
     public static void main(String google[]){
		 boolean isUserCreated = Google.createUser("Chandana","26-05-2003",22,"chandu123","chandu123");
		 if(isUserCreated)
		 Google.getCreateUserInfo();
	     System.out.println("The user is created  "+isUserCreated);
	 }
}	 