class SwiggyRunner {
	public static void main(String foodorder[]){
     boolean isUserRegistered = Swiggy.RegisterUser("Chandana","Chaya","Banglore",5643675467L,"chand23@gmail.com");
     if(isUserRegistered)
     Swiggy.getRegisterDetails();
     System.out.println("The Account is is registered"+isUserRegistered);
	 }
}
