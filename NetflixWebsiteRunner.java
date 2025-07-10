class NetflixWebsiteRunner {
     public static void main(String netflix[]){
		  boolean nowUserIsRegistered = NetflixWebsite.registerNow("chandu345@gmail.com");
		 System.out.println(" Now Registered user account is created "+nowUserIsRegistered);
		 
		 NetflixWebsite.getRegisterInfo();
	 }
}