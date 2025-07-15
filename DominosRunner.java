class DominosRunner {
	static String firstName;
	static String lastName;
	static int pinCode;
	static long phoneNumber;
	static String email;
	
	public static boolean RegisterUser(String fName, String lName, int pCode, long pNumber, String mail){
		
		boolean isUserRegistered = false;
		boolean isUserValidated = DominosValidation.ValidateDominosUser(fName,lName,pCode,pNumber,mail);
		if(isUserValidated = true){
			isUserRegistered = true;
		}else System.out.println("The user is not done with validation and registeration");
		
		return isUserRegistered;
	}
	
	
    public static void getRegisterDetails(){
	firstName = DominosValidation.firstName;
	lastName = DominosValidation.lastName;
	pinCode = DominosValidation.pinCode;
	email = DominosValidation.email;
	phoneNumber = DominosValidation.phoneNumber;
	
    System.out.println("The firstName is "+firstName);
    System.out.println("The lastName is "+lastName);
    System.out.println("The pincode is "+pinCode);
    System.out.println("The email is "+email);
    System.out.println("The phoneNumber is "+phoneNumber);
	}

	public static void main(String pizza[]){
		boolean isUserRegistered = DominosValidation.ValidateDominosUser("chandana","gowda",560058,9453675897L,"chandu23@gmail.com");
		if(isUserRegistered)
		getRegisterDetails();
	    System.out.println("The user is registered "+isUserRegistered);
	}
}

