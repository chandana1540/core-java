class SwiggyRunner {
	static String firstName;
	static String surName;
	static String location;
	static long phoneNumber;
	static String email;
	
	public static boolean RegisterUser(String fName, String sName, String loc, long pNumber, String mail){
		
		boolean isUserRegistered = false;
		boolean isUserValidated = SwiggyValidation.ValidateSwiggyUser(fName,sName,loc,pNumber,mail);
		if(isUserValidated == true){
			isUserRegistered = true;
		} else System.out.println("the user is not done with registeration and validation");
		
		return isUserRegistered;
	}
	
    public static void getRegisterDetails(){
		
	firstName = SwiggyValidation.firstName;
	surName = SwiggyValidation.surName;
	location = SwiggyValidation.location;
	email = SwiggyValidation.email;
	phoneNumber = SwiggyValidation.phoneNumber;
	
    System.out.println("The firstName is "+firstName);
    System.out.println("The surName is "+surName);
    System.out.println("The location is "+location);
    System.out.println("The email is "+email);
    System.out.println("The phoneNumber is "+phoneNumber);
	}
	public static void main(String foodorder[]){
     boolean isUserRegistered = SwiggyValidation.ValidateSwiggyUser("Chandana","Chaya","Banglore",5643675467L,"chand23@gmail.com");
     if(isUserRegistered)
     getRegisterDetails();
	 }
}
