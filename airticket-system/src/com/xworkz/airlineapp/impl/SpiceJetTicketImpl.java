package com.xworkz.airlineapp.impl;

import com.xworkz.airlineapp.AirTicketTransaction;

public class SpiceJetTicketImpl implements AirTicketTransaction {

    @Override
    public void credit() {
        System.out.println("Ticket booked successfully via SpiceJet.");
    }

    @Override
    public void debit() {
        System.out.println("Ticket cancelled successfully from SpiceJet.");
    }
}