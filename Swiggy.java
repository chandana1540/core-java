class Swiggy{
	static String firstName;
	static String surName;
	static String location;
	static long phoneNumber;
	static String email;
	
	public static boolean RegisterUser(String fName, String sName, String loc, long pNumber, String mail){
		boolean firstNameValid = false;
		boolean surNameValid = false;
		boolean locationValid = false;
		boolean phoneNumberValid = false;
		boolean emailValid = false;
		boolean isUserRegistered = false;
		if(fName != null){
			firstName=fName;
			firstNameValid=true;
		}else System.out.println("The FullName is not a valid");
		
		if(sName != null){
			surName=sName;
			surNameValid=true;
		}else System.out.println("The LastName is not a valid");
		
		if(loc != null){
			location=loc;
			locationValid=true;
		}else System.out.println("The pincode is not valid");
		
		if(pNumber != 0){
			phoneNumber=pNumber;
			phoneNumberValid=true;
		}else System.out.println("The phoneeNUmber is not a valid");
		
		if(mail != null){
			email=mail;
			emailValid=true;
		}else System.out.println("The email is not valid");
		
		if(firstNameValid && surNameValid && locationValid && phoneNumberValid && emailValid){
		isUserRegistered = true;
		}else System.out.println("The user is not registered");

		return isUserRegistered;
	}
    public static void getRegisterDetails(){
    System.out.println("The firstName is "+firstName);
    System.out.println("The surName is "+surName);
    System.out.println("The location is "+location);
    System.out.println("The email is "+email);
    System.out.println("The phoneNumber is "+phoneNumber);
	}
}