package com.xworkz.bankingapp.Impl;

import com.xworkz.bankingapp.Transaction;

public class CannaraImpl implements Transaction {
    @Override
    public void credit() {
        System.out.println("The amount is credit in cannara");
    }

    @Override
    public void debit() {
        System.out.println("The amount is debit in cannara");
    }
}
