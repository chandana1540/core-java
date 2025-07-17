class Pinterest{
	public static String logIn(String email, String password){
		String name = null;
		if(email == "chandu34@gmail.com"){
			password = "chadana@123";
			name = "Chandana L";
		return name;
		}
		if(email == "sagar34@gmail.com"){
			password = "sagu435";
			name = "Sagar L";
		return name;
		}
		return name;
	}
		
	public static String logIn(long phoneNumber, String password){
		String name = null;
		if(phoneNumber == 4567213478L){
			password = "chadana@123";
			name = "Chandana L";
			return name;
		}
		if(phoneNumber == 7843245798L){
			password = "Sagarmarket24";
			name = "Sagar L";
			return name;
	    }
	    return name;
}
}