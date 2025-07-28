class Roti {
	Roti() {
        System.out.println("Roti is invoked");
    }

    Roti(String type, String flour, double diameter, double price, boolean isStuffed, String servedWith) {
        System.out.println("Roti parameterized constructor is invoked");
        this.type = type;
        this.flour = flour;
        this.diameter = diameter;
        this.price = price;
        this.isStuffed = isStuffed;
        this.servedWith = servedWith;
    }

    String type;
    String flour;
    double diameter;
    double price;
    boolean isStuffed;
    String servedWith;
	
	public void getRotiInfo(){ 
	    System.out.println("type1 is " + type);
        System.out.println("flour1 is " + flour);
        System.out.println("diameter1 is " + diameter);
        System.out.println("price1 is " + price);
        System.out.println("isStuffed1 is " + isStuffed);
        System.out.println("servedWith1 is " + servedWith);
	}
		
}
