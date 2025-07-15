class jioHotStarRunner {
	static String fullName;
	static int age;
	static char gender;
	static long mobileNumber;
	static String email;
	
	public static boolean AccountUser(String fName, int Age, char G, long mNumber, String mail){
		boolean isAccountcreated = false;
		boolean isUserValidated = jioHotStarValidation.jioHotStarValidator(fName,Age,G,mNumber,mail);
		if(isUserValidated = true){
			isAccountcreated = true;
		}else System.out.println("The user is not done with validation and registeration");
		return isAccountcreated;
        }
	 
	 
    public static void getUserDetails(){
	 fullName = jioHotStarValidation.fullName;
	 age = jioHotStarValidation.age;
	 gender = jioHotStarValidation.gender;
	 mobileNumber = jioHotStarValidation.mobileNumber;
	 email = jioHotStarValidation.email;
	 
		System.out.println("The fullName is "+fullName);
		System.out.println("The age is "+age);
		System.out.println("The gender is "+gender);
		System.out.println("The mobileNumber is "+mobileNumber);
		System.out.println("The mail is "+email);
	   }		
     public static void main(String jio[]){
		 boolean isAccountcreated = jioHotStarValidation.jioHotStarValidator("Chandrika",21,'F',4356452356L,"chandri34@gmail.com");
         if(isAccountcreated)
         getUserDetails();
         System.out.println("The user is created "+isAccountcreated);
	 }
     }

	 