class FaceBookLiteRunner {
	public static void main(String chandu[]){
		String mail = "cheth23@gmail.com";
		String pwd = "chethu23.,";
		long pNo = 5673823564L;
		
		String emailLogIn = FaceBookLite.logIn(mail,pwd);
		System.out.println(" The User Name is "+emailLogIn+" and email is "+mail);
		
		String phoneNoLogIn = FaceBookLite.logIn(pNo, pwd);
		System.out.println(" The User Name is "+phoneNoLogIn+" and pphoneNumber is "+pNo);
	}
}
		