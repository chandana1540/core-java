class MicroSoftRunner {
	public static void main(String chandu[]){
		String mail = "chandanasd54@gmail.com";
		String pwd = "c1h2a3.,";
		long phoneNo = 3487623198L;
		
		String emailSignIn = MicroSoft.signIn(mail,pwd);
		System.out.println(" The Name Of the User is "+emailSignIn+" and email is "+mail);
		
		String phoneNumberSignIn = MicroSoft.signIn(phoneNo,pwd);
		System.out.println("The name Of the User is "+phoneNumberSignIn+" and phoneNumber is "+phoneNo);
	}
}