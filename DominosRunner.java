class DominosRunner {
	public static void main(String pizza[]){
		boolean isUserRegistered = Dominos.RegisterUser("chandana","gowda",560058,9453675897L,"chandu23@gmail.com");
		if(isUserRegistered)
		Dominos.getRegisterDetails();
	    System.out.println("The user is registered "+isUserRegistered);
	}
}

