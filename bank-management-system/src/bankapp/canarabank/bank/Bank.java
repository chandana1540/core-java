package bankapp.canarabank.bank;

public class Bank {
    String bankName;
    String userName;
    String email;
    int bankBalance;

    Bank(String bankName, String userName, String email, int bankBalance){
        this.bankName = bankName;
        this.userName = userName;
        this.email = email;
        this.bankBalance= bankBalance;
    }
    public void getBankInfo(){
        System.out.println("bankName: "+bankName);
        System.out.println("userName: "+userName);
        System.out.println("email: "+email);
        System.out.println("bankBalance: "+bankBalance);


    }
}
