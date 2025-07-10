class Zomato{
	static String fullName;
	static String email;
	public static boolean createAccountUser(String fName, String mail){
		boolean isAccountCreated = false;
		boolean fullNameValid = false;
		boolean emailValid = false;
		if(fName != null){
			fullName = fName;
			fullNameValid = true;
		}
		if(mail != null){
			email = mail;
			emailValid = true;
		}
		if(fullNameValid == true && emailValid == true){
			isAccountCreated = true;
		}
		return isAccountCreated;
	}
    public static void getAccountUserInfo(){
		System.out.println("the fullName for createAccount is "+fullName);
		System.out.println("the email for createAccount is "+email);
		
	}
}
