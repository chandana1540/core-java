class ForestSafari {
	ForestSafari() {
		System.out.println("Safari is invoked");
    }

    ForestSafari(String name, String location, String forestType, double ticketPrice, int durationInHours, boolean hasGuide) {
		System.out.println("ForestSafari parameterized constructor is invoked");
        this.name = name;
        this.location = location;
        this.forestType = forestType;
        this.ticketPrice = ticketPrice;
        this.durationInHours = durationInHours;
        this.hasGuide = hasGuide;
    }

    String name;
    String location;
    String forestType;
    double ticketPrice;
    int durationInHours;
    boolean hasGuide;
	
	public void getSafariInfo(){
		System.out.println("name is " + name);
        System.out.println("location is " + location);
        System.out.println("forestType is " + forestType);
        System.out.println("ticketPrice is " + ticketPrice);
        System.out.println("durationInHours is " + durationInHours);
        System.out.println("hasGuide is " + hasGuide);
	}
}
