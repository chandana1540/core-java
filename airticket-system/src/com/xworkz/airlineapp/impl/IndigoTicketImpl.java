package com.xworkz.airlineapp.impl;

import com.xworkz.airlineapp.AirTicketTransaction;

public class IndigoTicketImpl implements AirTicketTransaction {

    @Override
    public void credit() {
        System.out.println("Ticket booked successfully via Indigo Airlines.");
    }

    @Override
    public void debit() {
        System.out.println("Ticket cancelled successfully from Indigo Airlines.");
    }
}