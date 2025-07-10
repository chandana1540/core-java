class SnapChatRunner {
    public static void main(String snap[]){
		boolean isUserRegistered = SnapChat.registerUser("chandana","gowda");
		System.out.println("is user registered "+isUserRegistered);
		
		SnapChat.getUserInfo();
	}
}