class MeeshoRunner{
  public static void main(String meesho[]){
	  boolean isUserRegistered = Meesho.RegisterUser("gangu",4567854686L,"gang23@gmail.com","g1a2g3.,","Banglore");
	  if(isUserRegistered)
		  Meesho.getRegisterInfo();
	      System.out.println("The user is registered "+isUserRegistered);
  }
}
