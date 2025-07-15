class SunNxtRunner {
	static String fullName;
	static long phoneNumber;
	static String location;
	static int userId;
	static int age;
	
	public static boolean SignUpUser(String fName,long pNumber , String loc ,int ID, int Age){
		boolean isSignedUp = false;
		boolean isUserValidated = SunNxtValidation.SunNxtValidateUser(fName,pNumber,loc,ID,Age);
		if(isUserValidated = true){
			isSignedUp = true;
		}else System.out.println("The user is not done with validation and registeration");
		return isSignedUp;
	}
	
		
	public static void getSignedUpDetails(){
	fullName = SunNxtValidation.fullName;
	phoneNumber = SunNxtValidation.phoneNumber;
	location = SunNxtValidation.location;
	userId = SunNxtValidation.userId;
	age = SunNxtValidation.age;
	
			System.out.println("The fullName is "+fullName);
			System.out.println("The phoneNumber is "+phoneNumber);
			System.out.println("The location is "+location);
			System.out.println("The userId is "+userId);
            System.out.println("The age is "+age);
		}
	public static void main(String sunnxt[]){
		boolean isSignedUp = SunNxtValidation.SunNxtValidateUser("Sagar",9643567898L,"Banglore",12,24);
		if(isSignedUp)
		getSignedUpDetails();
	    System.out.println("The user is signed up "+isSignedUp);
	}
}