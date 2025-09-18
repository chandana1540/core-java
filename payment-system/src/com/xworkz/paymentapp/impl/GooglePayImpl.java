package com.xworkz.paymentapp.impl;

import com.xworkz.paymentapp.Payment;

public class GooglePayImpl implements Payment {

    @Override
    public void credit() {
        System.out.println("Amount credited via Google Pay.");
    }

    @Override
    public void debit() {
        System.out.println("Amount debited via Google Pay.");
    }
}


