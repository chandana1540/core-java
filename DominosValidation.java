class DominosValidation {
	static String firstName;
	static String lastName;
	static int pinCode;
	static long phoneNumber;
	static String email;
	
	public static boolean ValidateDominosUser(String fName, String lName, int pCode, long pNumber, String mail){
		boolean firstNameValid = false;
		boolean lastNameValid = false;
		boolean pinCodeValid = false;
		boolean phoneNumberValid = false;
		boolean emailValid = false;
		boolean isUserValidated = false;
	if(fName != null){
			firstName=fName;
			firstNameValid=true;
		}else System.out.println("The FullName is not a valid");
		
		if(lName != null){
			lastName=lName;
			lastNameValid=true;
		}else System.out.println("The LastName is not a valid");
		
		if(pCode != 0){
			pinCode=pCode;
			pinCodeValid=true;
		}else System.out.println("The pincode is not valid");
		
		if(pNumber != 0){
			phoneNumber=pNumber;
			phoneNumberValid=true;
		}else System.out.println("The phoneeNUmber is not a valid");
		
		if(mail != null){
			email=mail;
			emailValid=true;
		}else System.out.println("The email is not valid");
		
		if(firstNameValid && lastNameValid && pinCodeValid && phoneNumberValid && emailValid){
		isUserValidated = true;
		}else System.out.println("The user is not registered");
		return isUserValidated;
	}
}