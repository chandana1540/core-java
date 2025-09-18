package com.xworkz.paymentapp.impl;


import com.xworkz.paymentapp.Payment;

public class PhonePeImpl implements Payment {

    @Override
    public void credit() {
        System.out.println("Amount credited via PhonePe.");
    }

    @Override
    public void debit() {
        System.out.println("Amount debited via PhonePe.");
    }
}
