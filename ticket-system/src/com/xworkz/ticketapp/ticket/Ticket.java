package com.xworkz.ticketapp.ticket;

public class Ticket {
  private int ticketId;

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }//encapsulated class

    public int getTicketId() {
        return ticketId;
    }

    String ticketType;
  double ticketPrice;
  int noOfTickets;

  Ticket(int ticketId, String ticketType, double ticketPrice, int noOfTickets) {
      this.ticketId = ticketId;
      this.ticketType = ticketType;
      this.ticketPrice = ticketPrice;
      this.noOfTickets = noOfTickets;
  }
  public void getTicketInfo(){
      System.out.println("ticketId: "+ticketId);
      System.out.println("ticketType: "+ticketType);
      System.out.println("ticketPrice: "+ticketPrice);
      System.out.println("noOfTickets: "+noOfTickets);

}
}
