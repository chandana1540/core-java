class FlipKartRunner {
     public static void main(String flip[]){
	 boolean isAccountCreated =  FlipKart.createUser("chandana L", 560058, "muneshwar Layout Laggare",3245345678L,"chandu45");
	 if(isAccountCreated)
	 FlipKart.getAccountInfo();
	 System.out.println("The account is created successfully "+isAccountCreated);
	 }
	 }