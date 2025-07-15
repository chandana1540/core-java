class jioHotStarValidation{
    static String fullName;
	static int age;
	static char gender;
	static long mobileNumber;
	static String email;
	
	public static boolean jioHotStarValidator(String fName, int Age, char G, long mNumber, String mail){
		boolean isUserValidated = false;
		boolean fullNameValid = false;
		boolean ageValid = false;
		boolean genderValid = false;
		boolean mobileNumberValid = false;
		boolean emailValid = false;
		
		if(fName!=null){
			fullName = fName;
			fullNameValid = true;
		} else System.out.println("The fullName is  not valid ");
		
		if(Age!=0){
			age = Age;
			ageValid = true;
		} else System.out.println("The age is  not valid");
		
		if(G!= ' '){ 
		    gender = G;
		    genderValid = true;
	    } else System.out.println("The gender is not valid");
	    
		if(mNumber!=0){
			mobileNumber = mNumber;
			mobileNumberValid = true;
		} else System.out.println("The mobileNumber is not valid");
		if(mail != email){
			email = mail;
			emailValid = true;
		} else System.out.println("The email is not valid ");
		
		if(fullNameValid && ageValid && genderValid && mobileNumberValid && emailValid){
			isUserValidated = true;
		} else System.out.println("The user is not valid");
		return isUserValidated;
	    }
      }
	

		