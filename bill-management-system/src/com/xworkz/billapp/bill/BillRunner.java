package com.xworkz.billapp.bill;

public class BillRunner {
    public static void main(String[] args) {

        Bill bill = new Bill(34, "24-08-2025", "product item type", 24000);
        bill.getBillInfo();
    }
}
