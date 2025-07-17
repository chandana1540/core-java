class PinterestRunner{
	public static void main (String chand[]){
		String mail = "chandu34@gmail.com";
		String pwd = "chadana@123";
		long phoneNo = 4567213478L;
		
		String emailLogIn = Pinterest.logIn(mail,pwd);
		System.out.println("The Name Of the User is "+emailLogIn+" and the email is "+mail);
		
		String phoneNumberLogIn = Pinterest.logIn(phoneNo,pwd);
		System.out.println("The Name Of the User is "+phoneNumberLogIn+" and the phoneNumber is "+phoneNo);
	}
}
		
		