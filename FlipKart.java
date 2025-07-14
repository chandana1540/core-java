class FlipKart{
	static String fullName;
	static int pinCode;
	static String address;
	static long mobileNumber;
    static String password;

    public static boolean createUser(String fName, int pCode,String add, long mNo, String pwd){
    boolean fullNameValid = false;
    boolean pinCodeValid = false;
    boolean addressValid = false;
    boolean mobileNumberValid =false;
    boolean passwordValid = false;
	boolean isAccountCreated = false;
    
    if(fName != null){
		fullName = fName;
		fullNameValid = true;
	} else System.out.println("The fullname is not valid");
	
	if(pCode != 0){
		pinCode = pCode;
		pinCodeValid = true;
	} else System.out.println("The pinCode is not valid");
	 
	if(add != null){
		address = add;
		addressValid = true;
	} else System.out.println("The pincode is not valid");
	
	if(mNo != 0){
		mobileNumber = mNo;
		mobileNumberValid = true;
	} else System.out.println("The mobile Number is not valid");
	
	if(pwd != null){
		password = pwd;
		passwordValid = true;
	} else System.out.println("The password is not valid");
	
	if(fullNameValid && pinCodeValid && addressValid && mobileNumberValid && passwordValid){
	isAccountCreated = true;
    } else System.out.println("The account created is not valid");
   
    return isAccountCreated;
	}
public static void getAccountInfo(){
System.out.println("The fullName is "+fullName);
System.out.println("The pincode is "+pinCode);
System.out.println("The address is "+address);
System.out.println("The mobileNumber is "+mobileNumber);
System.out.println("The password is "+password);
}
}	
	
	
	