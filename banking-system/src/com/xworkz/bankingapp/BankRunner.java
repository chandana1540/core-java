package com.xworkz.bankingapp;

import com.xworkz.bankingapp.Impl.CannaraImpl;
import com.xworkz.bankingapp.Impl.HdfcImpl;
import com.xworkz.bankingapp.Impl.SbiImpl;

public class BankRunner {
    public static void main(String[] args) {
        Transaction transaction = new CannaraImpl();
        transaction.credit();
        transaction.debit();

        Transaction transaction1 = new HdfcImpl();
        transaction1.credit();
        transaction1.debit();

        Transaction transaction2 = new SbiImpl();
        transaction2.credit();
        transaction2.debit();
    }
}
