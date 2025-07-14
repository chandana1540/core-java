class TwitterRunner {
	public static void main(String twitt[]){
		boolean isAccountCreated = Twitter.createAccountUser("Lakshmana KB","laksh23@gmail.com","1-06-1970","laks235","laks235");
		
		if(isAccountCreated)
		Twitter.getAccountUserInfo();	
	    System.out.println("The account is created "+isAccountCreated);
	}
}
