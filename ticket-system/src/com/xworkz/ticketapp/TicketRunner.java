package com.xworkz.ticketapp;
import com.xworkz.ticketapp.ticket.Ticket;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(124,"busBooking",230.68,4);//internalise
        ticket.getTicketInfo();
    }
}
