class LinkedInRunner {
	public static void main(String chandu[]){
		String mail = "Gunav43@gmail.com";
		String pwd = "gunu34@.";
		long phoneNo = 7574832984L;
		
		String maillogIn = LinkedIn.logIn(mail,pwd);
		System.out.println(" The User Name is "+maillogIn+" and the email is "+mail);
		
		String phoneNologIn = LinkedIn.logIn(phoneNo,pwd);
		System.out.println(" The user Name is "+phoneNologIn+" and the phoneNo is "+phoneNo);
	}
}
		
