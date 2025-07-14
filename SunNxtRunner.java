class SunNxtRunner {
	public static void main(String sunnxt[]){
		boolean isSignedUp = SunNxt.SignUpUser("Sagar",9643567898L,"Banglore",12,24);
		if(isSignedUp)
		SunNxt.getSignedUpDetails();
	    System.out.println("The user is signed up "+isSignedUp);
	}
}