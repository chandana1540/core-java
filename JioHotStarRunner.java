class JioHotStarRunner {
     public static void main(String jio[]){
		 boolean isAccountcreated = JioHotStar.AccountUser("Chandrika",21,'F',4356452356L,"chandri34@gmail.com");
         if(isAccountcreated)
         JioHotStar.getUserDetails();
         System.out.println("The user is created "+isAccountcreated);
	 }
}
	 