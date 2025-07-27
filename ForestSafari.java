class ForestSafari {
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
