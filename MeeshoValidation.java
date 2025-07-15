class MeeshoValidation{
	static String fullName;
	static long phoneNumber;
	static String email;
	static String password;
	static String location;
	
	public static boolean ValidateMeeshoUser(String fName,long pNo, String mail, String pwd, String loc){
		boolean isUserValidated = false;
		boolean fullNameValid = false;
		boolean phoneNumberValid = false;
		boolean emailValid = false;
		boolean passwordValid = false;
		boolean locationValid = false;
		
		if(fName!=null){
			fullName = fName;
			fullNameValid = true;
		} else System.out.println("The fullName is not valid");	
		if(pNo != 0){
			phoneNumber = pNo;
			phoneNumberValid = true;
		} else System.out.println("The phone Number is not valid");
		if(mail != null){
	       email = mail;
	       emailValid = true;
        } else System.out.println("The email is not valid");
		if(pwd != null){
         password = pwd;
         passwordValid = true;
        } else System.out.println("The password is not valid");
		if(loc != null){
			location = loc;
			locationValid = true;
		} else System.out.println("The location is not valid");
		if(fullNameValid&&phoneNumberValid&&emailValid&&passwordValid&&locationValid){
			isUserValidated=true;
		}
		return isUserValidated;
	}
}