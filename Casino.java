class Casino {
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
