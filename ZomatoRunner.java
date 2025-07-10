class ZomatoRunner {
	public static void main(String orderingApp[]){
		boolean isAccountCreated = Zomato.createAccountUser("Chandana L","chandu23@gmail.com");
		System.out.println("the userAccount is created "+isAccountCreated);
		
		Zomato.getAccountUserInfo();
	}
}