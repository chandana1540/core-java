class Dominos{
	static String firstName;
	static String lastName;
	static int pinCode;
	static long phoneNumber;
	static String email;
	
	public static boolean RegisterUser(String fName, String lName, int pCode, long pNumber, String mail){
		boolean firstNameValid = false;
		boolean lastNameValid = false;
		boolean pinCodeValid = false;
		boolean phoneNumberValid = false;
		boolean emailValid = false;
		boolean isUserRegistered = false;
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
		isUserRegistered = true;
		}else System.out.println("The user is not registered");

		return isUserRegistered;
	}
    public static void getRegisterDetails(){
    System.out.println("The firstName is "+firstName);
    System.out.println("The lastName is "+lastName);
    System.out.println("The pincode is "+pinCode);
    System.out.println("The email is "+email);
    System.out.println("The phoneNumber is "+phoneNumber);
	}
}
