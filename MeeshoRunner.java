class MeeshoRunner{
	static String fullName;
	static long phoneNumber;
	static String email;
	static String password;
	static String location;
	
	public static boolean RegisterUser(String fName,long pNo, String mail, String pwd, String loc){
		boolean isUserRegistered = false;
		
		boolean isUserValidated = MeeshoValidation.ValidateMeeshoUser(fName,pNo,mail,pwd,loc);
		if(isUserValidated==true){
			
			isUserRegistered = true;
		}else System.out.println("The user is not done with Validation and registeration");
		return isUserRegistered;
	}
	    
		public static void getRegisterInfo(){
		fullName = MeeshoValidation.fullName;
	    phoneNumber = MeeshoValidation.phoneNumber;
	    email = MeeshoValidation.email;
	    password = MeeshoValidation.password;
	    location = MeeshoValidation.location;
		
			System.out.println("The fullName is "+fullName);
			System.out.println("The phoneNumber is "+phoneNumber);
			System.out.println("The email is "+email);
			System.out.println("the password is "+password);
			System.out.println("The location is "+location);
		}
	
  public static void main(String meesho[]){
	  boolean isUserRegistered = MeeshoValidation.ValidateMeeshoUser("gangu",4567854686L,"gang23@gmail.com","g1a2g3.,","Banglore");
	  if(isUserRegistered)
		  getRegisterInfo();
	      System.out.println("The user is registered "+isUserRegistered);
  }
}
