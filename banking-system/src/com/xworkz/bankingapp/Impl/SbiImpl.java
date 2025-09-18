package com.xworkz.bankingapp.Impl;

import com.xworkz.bankingapp.Transaction;

public class SbiImpl implements Transaction {
    @Override
    public void credit() {
        System.out.println("The amount is credit in SBI");
    }

    @Override
    public void debit() {
        System.out.println("The amount is debit in SBI");

    }
}
