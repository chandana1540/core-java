class CourtCase {
	CourtCase() {
        System.out.println("The CourtCase is Invoked");
    }

    CourtCase(String number, String defendant, String court, String judge, boolean open, String result) {
        System.out.println("CourtCase parameterized constructor is invoked");
        this.number = number;
        this.defendant = defendant;
        this.court = court;
        this.judge = judge;
        this.open = open;
        this.result = result;
    }
	String number;
    String defendant;
    String court;
    String judge;
    boolean open;
    String result;
	
	public void getCaseInfo(){
		System.out.println("number is " + number);
        System.out.println("defendant is " + defendant);
        System.out.println("court is " + court);
        System.out.println("judge is " + judge);
        System.out.println("open is " + open);
        System.out.println("result is " + result);
	}	
}
