class FlipKartRunner {
	
	static String fullName;
	static int pinCode;
	static String address;
	static long mobileNumber;
    static String password;

    public static boolean createUser(String fName, int pCode,String add, long mNo, String pwd){
    
	boolean isAccountCreated = false;
	boolean isUserValidated = FlipKartValidation.FlipKartValidator(fName,pCode,add,mNo,pwd);
	if(isUserValidated == true){
	isAccountCreated = true;
	
	}
    return isAccountCreated;
	}
	
public static void getAccountInfo(){
	
	fullName=FlipKartValidation.fullName;
	pinCode = FlipKartValidation.pinCode;
	address = FlipKartValidation.address;
	mobileNumber = FlipKartValidation.mobileNumber;
	password = FlipKartValidation.password;
	
	
System.out.println("The fullName is "+fullName);
System.out.println("The pincode is "+pinCode);
System.out.println("The address is "+address);
System.out.println("The mobileNumber is "+mobileNumber);
System.out.println("The password is "+password);
}
	
     public static void main(String flip[]){
	 boolean isAccountCreated =  FlipKartValidation.FlipKartValidator(null, 0, "muneshwar Layout Laggare",3245345678L,"chandu45");
	 if(isAccountCreated)
	        getAccountInfo();
	 System.out.println("The account is created successfully "+isAccountCreated);
	 }
	 }