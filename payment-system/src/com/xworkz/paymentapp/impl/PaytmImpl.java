package com.xworkz.paymentapp.impl;

import com.xworkz.paymentapp.Payment;

public class PaytmImpl implements Payment {
    @Override
    public void credit() {
        System.out.println("Amount credited via Paytm.");
    }

    @Override
    public void debit() {
        System.out.println("Amount debited via Paytm.");
    }
}
