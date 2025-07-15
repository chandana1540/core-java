class TwitterRunner {
	static String fullName;
	static String email;
	static String dateOfBirth;
	static String password;
    static String confirmPassword;

    public static boolean createAccountUser(String fName, String mail, String DOB, String pwd, String cpwd){
    boolean isAccountCreated = false;

    boolean isUserValidated= TwitterValidation.TwitterValidator(fName,mail,DOB,pwd,cpwd);

    if(isUserValidated == true){
	isAccountCreated = true;
    }
    return isAccountCreated;
    }

public static void getAccountUserInfo(){
    fullName = TwitterValidation.fullName;
    email = TwitterValidation.email;
    dateOfBirth = TwitterValidation.dateOfBirth;
    password = TwitterValidation.password;
    confirmPassword =TwitterValidation.confirmPassword;

    System.out.println("The fullName is "+fullName);
    System.out.println("The email is "+email);
    System.out.println("The dateOfBirth is "+dateOfBirth);
    System.out.println("the password is "+password);
    System.out.println("The confirmPassword is "+confirmPassword);
}
        public static void main(String twitter[]){
		boolean isAccountCreated = TwitterValidation.TwitterValidator("Lakshmana KB","laksh23@gmail.com","1-06-1970","laks235","laks235");
		
		if(isAccountCreated)
		getAccountUserInfo();	
	    System.out.println("The account is created "+isAccountCreated);
	}
}
