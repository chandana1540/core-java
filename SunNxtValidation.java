class SunNxtValidation{
    static String fullName;
	static long phoneNumber;
	static String location;
	static int userId;
	static int age;
	
	public static boolean SunNxtValidateUser(String fName,long pNumber , String loc ,int ID, int Age){
		boolean isUserValidated = false;
		boolean fullNameValid = false;
		boolean phoneNumberValid = false;
		boolean locationValid = false;
		boolean userIdValid = false;
		boolean ageValid = false;
		
		if(fName != null){
			fullName = fName;
			fullNameValid = true;
		} else System.out.println("The Fullname is not valid");
		
		if(pNumber != 0){
			phoneNumber = pNumber;
			phoneNumberValid = true;
		} else System.out.println("The phoneNumber is not valid");
		
		if(loc != null){
			location = loc;
			locationValid = true;
		} else System.out.println("The location is not valid");
		
		if(ID != 0){
			userId = ID;
			userIdValid = true;
		} else System.out.println("the userId is not valid");
		
		if(Age != 0){
			age = Age;
			ageValid = true;
		} else System.out.println("The age is not valid");
		
		if(fullNameValid && phoneNumberValid && locationValid && userIdValid && ageValid){
			isUserValidated = true;
		} else System.out.println("the user signedUp is not valid");
		return isUserValidated;
	}
}