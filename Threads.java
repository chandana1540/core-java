class Threads {
	public static String logIn(String email, String password){
		String name = null;
		if(email == "Chinmay23@gmail,com"){
			password = "chinu520./";
			name = "Chinmay G";
			return name;
		}
		if(email == "Thanu41@gmail.com"){
			password = "thanu23*,";
			name = "ThanuShree D";
			return name;
		}
		return name;
	}
	public static String logIn(long phoneNumber, String password){
		String name = null;
		if(phoneNumber == 4532935443L){
			password = "chinu520./";
			name = "Chinmay G";
			return name;
		}
		if(phoneNumber == 2461537694L){
			password = "thanu23*,";
			name = "ThanuShree D";
			return name;
		}
		return name;
	}
}
			
			