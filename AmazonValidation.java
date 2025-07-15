class AmazonValidation{
    
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static long phoneNumber;
	static String email;
	
	public static boolean AmazonValidater(String fName, String lName, String DOB, long pNumber, String mail){
		boolean firstNameValid = false;
		boolean lastNameValid = false;
		boolean dateOfBirthValid = false;
		boolean phoneNumberValid = false;
		boolean emailValid = false;
		boolean isUserValidated = false;
		
		if(fName != null){
			firstName = fName;
			firstNameValid = true;
		} else System.out.println("The firstName is not valid");
		
		if(lName != null){
			lastName = lName;
			lastNameValid = true;
		} else System.out.println("The lastName is not valid ");
		
		if(DOB != null){
			dateOfBirth = DOB;
			dateOfBirthValid = true;
		} else System.out.println("The dateofBirth is not valid");
		
		if(pNumber != 0){
			phoneNumber = pNumber;
			phoneNumberValid = true;
		} else System.out.println("The phone Number is not valid");
		
		if(mail != null){
			email = mail;
			emailValid = true;
		} else System.out.println("The email is not valid");
		
		if(firstNameValid && lastNameValid && dateOfBirthValid && phoneNumberValid && emailValid){
			isUserValidated = true;
		} else System.out.println("The create account is not Valid");
		return isUserValidated;
	}
}