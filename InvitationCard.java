class InvitationCard {
	InvitationCard() {
        System.out.println("InvitationCard is invoked");
    }

    InvitationCard(String occasion, String fromName, String toName, String date, String venue, boolean isPrinted) {
        System.out.println("InvitationCard parameterized constructor is invoked");
        this.occasion = occasion;
        this.fromName = fromName;
        this.toName = toName;
        this.date = date;
        this.venue = venue;
        this.isPrinted = isPrinted;
    }
    String occasion;
    String fromName;
    String toName;
    String date;
    String venue;
    boolean isPrinted;
	
	public void getCardInfo(){
    System.out.println("occasion is " + occasion);
    System.out.println("fromName is " + fromName);
    System.out.println("toName is " + toName);
    System.out.println("date is " + date);
    System.out.println("venue is " + venue);
    System.out.println("isPrinted is " + isPrinted);
	}

}
