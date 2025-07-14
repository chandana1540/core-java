class Twitter{
	static String fullName;
	static String email;
	static String dateOfBirth;
	static String password;
    static String confirmPassword;

public static boolean createAccountUser(String fName, String mail, String DOB, String pwd, String cpwd){
boolean isAccountCreated = false;
boolean fullNameValid = false;
boolean emailValid = false;
boolean dateOfBirthValid = false;
boolean passwordValid = false;
boolean confirmPasswordValid = false;

if(fName != null){
	fullName = fName;
    fullNameValid = true;
} else System.out.println("The fullName is not valid");	

if(mail != null){
	email = mail;
	emailValid = true;
} else System.out.println("The email is not valid");

if(DOB != null){
	dateOfBirth = DOB;
	dateOfBirthValid = true;
} else System.out.println("The dateOfBirth is not valid");

if(pwd != null){
    password = pwd;
    passwordValid = true;
} else System.out.println("The password is not valid");	

if(cpwd != null && cpwd == pwd){
   confirmPassword = cpwd;
   confirmPasswordValid = true;
} else System.out.println("The confirmPassword is not valid");

if(fullNameValid && emailValid && dateOfBirthValid && passwordValid && confirmPasswordValid){
isAccountCreated = true;
}
return isAccountCreated;
}
public static void getAccountUserInfo(){
System.out.println("The fullName is "+fullName);
System.out.println("The email is "+email);
System.out.println("The dateOfBirth is "+dateOfBirth);
System.out.println("the password is "+password);
System.out.println("The confirmPassword is "+confirmPassword);
}
}
	