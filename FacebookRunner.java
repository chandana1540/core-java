class FacebookRunner {
      public static void main(String socialMedia[]){
		 boolean isAccountCreated = Facebook.createAccountUser("chandana","roy");
		 System.out.println("The user Account is created "+isAccountCreated);
		 
		 Facebook.getUserAccountInfo();
	  }
}
