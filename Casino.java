class Casino {
	Casino() {
        System.out.println("Casino is Invoked");
    }
	 Casino(String name, String location, int numberOfTables, String owner, double entryFee, boolean hasHotel) {
		System.out.println("Casino parameterized constructor is invoked");
        this.name = name;
        this.location = location;
        this.numberOfTables = numberOfTables;
        this.owner = owner;
        this.entryFee = entryFee;
        this.hasHotel = hasHotel;
    }
	
    String name;
    String location;
    int numberOfTables;
    String owner;
    double entryFee;
    boolean hasHotel;
	
	public void getCasinoInfo(){
		System.out.println("name is " + name);
        System.out.println("location is " + location);
        System.out.println("numberOfTables is " + numberOfTables);
        System.out.println("owner is " + owner);
        System.out.println("entryFee is " + entryFee);
        System.out.println("hasHotel is " + hasHotel);
	}
}
