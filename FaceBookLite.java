class FaceBookLite {
	public static String logIn(String email, String password){
		String name = null;
		if(email == "cheth23@gmail.com"){
			password = "chethu23.,";
			name = "Chethana K";
			return name;
		}
		if(email == "Govind23@gmail.com"){
			password = "govu45#,.";
			name = "Govind B";
			return name;
		}
		return name;
	}
	public static String logIn(long phoneNumber, String password){
		String name = null;
		if(phoneNumber == 5673823564L){
			password = "chethu23.,";
			name = "Chethana K";
			return name;
		}
		if(phoneNumber == 7834625234L){
			password = "govu45#,.";
			name = "Govind B";
			return name;
		}
		return name;
	}
}
		