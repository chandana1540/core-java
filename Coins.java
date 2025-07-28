class Coins {
	Coins() {
        System.out.println("The Coins is invoked");
    }

    Coins(String country, double value, String metal, double diameter, double weight, int year, boolean isCommemorative) {
        System.out.println("Coins parameterized constructor is invoked");
        this.country = country;
        this.value = value;
        this.metal = metal;
        this.diameter = diameter;
        this.weight = weight;
        this.year = year;
        this.isCommemorative = isCommemorative;
    }
    String country;
    double value;
    String metal;
    double diameter;
    double weight;
    int year;
    boolean isCommemorative;
	
	public void getCoinsInfo(){
		System.out.println("country is " + country);
        System.out.println("value is " + value);
        System.out.println("meta1 is " + metal);
        System.out.println("diameter is " +diameter);
        System.out.println("weight is " + weight);
        System.out.println("year is " + year);
        System.out.println("isCommemorative is " +isCommemorative);
}
}