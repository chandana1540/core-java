class GoogleRunner {
     public static void main(String google[]){
		 boolean isUserCreated = Google.createUser("Chandana","26-05-2003",22,"chandu123","chandu123");
		 if(isUserCreated)
		 Google.getCreateUserInfo();
	     System.out.println("The user is created  "+isUserCreated);
	 }
}	 