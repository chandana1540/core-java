class AmusementPark {
	 AmusementPark() {
        System.out.println("Park is invoked");
    }

    AmusementPark(String name, String location, String owner, double entryFee, int numberOfRides, boolean hasWaterPark) {
		System.out.println("park parameterized constructor is invoked");
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.entryFee = entryFee;
        this.numberOfRides = numberOfRides;
        this.hasWaterPark = hasWaterPark;
    }
    String name;
    String location;
    String owner;
    double entryFee;
    int numberOfRides;
    boolean hasWaterPark;
	
	public void getParkInfo(){
		System.out.println("name is " + name);
        System.out.println("location is " + location);
        System.out.println("owner is " + owner);
        System.out.println("entryFee is " + entryFee);
        System.out.println("numberOfRides is " + numberOfRides);
        System.out.println("hasWaterPark is " + hasWaterPark);
	}
}
