class NetflixWebsite {
    static String email;
	
	public static boolean registerNow(String mail){
	   boolean nowUserIsRegistered =false;
       boolean emailValid = false;
       if(mail != null){
	   email = mail;
       emailValid = true;
	   }
	   if(emailValid == true){
	   nowUserIsRegistered = true;
	   }
	   return nowUserIsRegistered;
       }
    public static void getRegisterInfo(){
		System.out.println("the email for the netflix is "+email);
	}
	}
	
    	   