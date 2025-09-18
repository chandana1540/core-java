package com.xworkz.paymentapp;

import com.xworkz.paymentapp.impl.GooglePayImpl;
import com.xworkz.paymentapp.impl.PaytmImpl;
import com.xworkz.paymentapp.impl.PhonePeImpl;

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new PaytmImpl();
        payment1.credit();
        payment1.debit();

        Payment payment2 = new GooglePayImpl();
        payment2.credit();
        payment2.debit();

        Payment payment3 = new PhonePeImpl();
        payment3.credit();
        payment3.debit();
    }
}
