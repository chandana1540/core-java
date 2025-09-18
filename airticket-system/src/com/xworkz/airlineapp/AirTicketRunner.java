package com.xworkz.airlineapp;

import com.xworkz.airlineapp.impl.AirIndiaTicketImpl;
import com.xworkz.airlineapp.impl.IndigoTicketImpl;
import com.xworkz.airlineapp.impl.SpiceJetTicketImpl;

public class AirTicketRunner {
    public static void main(String[] args) {
        AirTicketTransaction ticket1 = new IndigoTicketImpl();
        ticket1.credit();
        ticket1.debit();

        AirTicketTransaction ticket2 = new AirIndiaTicketImpl();
        ticket2.credit();
        ticket2.debit();

        AirTicketTransaction ticket3 = new SpiceJetTicketImpl();
        ticket3.credit();
        ticket3.debit();
    }
}
