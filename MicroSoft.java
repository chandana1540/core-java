class MicroSoft{
	public static String signIn(String email, String password){
		String name = null;
		if(email == "chandanasd54@gmail.com"){
			password = "c1h2a3.,";
			name = "Chandana L";
			return name;
		}
		if(email == "charan56@gmail.com"){
			password = "charu67,";
			name = "Charan S";
			return name;
		}
	    return name;
	}
	public static String signIn(long phoneNumber, String password){
		String name = null;
		if(phoneNumber == 3487623198L){
			password = "c1h2a3.,";
			name = "Chandana L";
			return name;
		}
		if(phoneNumber == 7658439893L){
			password = "charu67,";
			name = "Charan S";
			return name;
		}
        return name;
	}
}
	