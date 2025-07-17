class ThreadsRunner {
	public static void main(String chandu[]){
		String mail = "Chinmay23@gmail,com";
		String pwd = "Chinmay G";
		long pNo = 4532935443L;
	
	String emaillogIn = Threads.logIn(mail,pwd);
	System.out.println(" The Name of User is "+emaillogIn+" and the email is "+mail);
	String phoneNumberlogIn = Threads.logIn(pNo,pwd);
	System.out.println(" The Name of  User is "+phoneNumberlogIn+" and the phoneNumber is "+pNo);
	}
}