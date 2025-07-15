class AmazonRunner {
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static long phoneNumber;
	static String email;
	
	public static boolean AccountCreation(String fName, String lName, String DOB, long pNumber, String mail){
		
		boolean isToCreateAccount = false;
		boolean isUserValidated = AmazonValidation.AmazonValidater(fName,lName,DOB,pNumber,mail);
		if(isUserValidated ==true){
			isToCreateAccount = true;
		}
		
		return isToCreateAccount;
	}
	 
	
	
	public static void getAccountInfo(){
	firstName = AmazonValidation.firstName;
	lastName = AmazonValidation.lastName;
	dateOfBirth = AmazonValidation.dateOfBirth;
	phoneNumber = AmazonValidation.phoneNumber;
	email = AmazonValidation.email;
	
		System.out.println("The firstName is "+firstName);
		System.out.println("The lastName is "+lastName);
		System.out.println("The dateOfBirth is "+dateOfBirth);
		System.out.println("The phoneNumber is "+phoneNumber);
		System.out.println("The email is "+email);
	}
     public static void main(String shop[]){
     boolean isToCreateAccount = AmazonValidation.AmazonValidater("Chandana","Chaya","12-03-2003",5643675467L,"chand23@gmail.com");
     if(isToCreateAccount)
     getAccountInfo();
     System.out.println("The Account is Created "+isToCreateAccount);
	 }
}
	 