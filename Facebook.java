class Facebook {
      static String firstName;
	  static String surName;
	  public static boolean createAccountUser(String fName, String sName){
	  boolean isAccountCreated = false;
	  boolean firstNameValid = false;
	  boolean surNameValid = false;
	  if(fName!= null){
		  firstName = fName;
		  firstNameValid = true;
	  }
	  if(sName!= null){
		  surName = sName;
		  surNameValid = true;
	  }
	  if(firstNameValid == true && surNameValid == true){
		  isAccountCreated = true;
	  }
	  return isAccountCreated;
      }
      public static void getUserAccountInfo(){
		  System.out.println("the firstName of the facebook is "+firstName);
		  System.out.println("the surName of the facebook is "+surName);
	  }
 }
	  