package com.xworkz.billapp.bill;

public class Bill {
    int billId;
    String billDueDate;
    String billType;
    int amountPaidWithTax;

    Bill(int billId, String billDueDate, String billType, int amountPaidWithTax){
        this.billId = billId;
        this.billDueDate = billDueDate;
        this.billType = billType;
        this.amountPaidWithTax = amountPaidWithTax;
    }
    public void getBillInfo(){
        System.out.println("billId: "+billId);
        System.out.println("billDueDate: "+billDueDate);
        System.out.println("billType: "+billType);
        System.out.println("amountPaidWithTax: "+amountPaidWithTax);
    }

}
