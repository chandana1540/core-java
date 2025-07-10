class Zee {
    static String email;
    

    public static boolean createAccount(String mail) {
        boolean iscreateAccount = false;
        boolean emailValid = false;
        if(mail != null){
            email = mail;
            emailValid = true;
        }
        
        if(emailValid == true){
            iscreateAccount = true;
        }
        
        return iscreateAccount;
    }

    public static void getAccountInfo(){
        System.out.println("The email for created account is " + email);
    }
}

 