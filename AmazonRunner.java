class AmazonRunner {
     public static void main(String onlineshop[]){
     boolean isToCreateAccount = Amazon1.AccountCreation("Chandana","Chaya","12-03-2003",5643675467L,"chand23@gmail.com");
     if(isToCreateAccount)
     Amazon1.getAccountInfo();
     System.out.println("The Account is Created "+isToCreateAccount);
	 }
}
	 