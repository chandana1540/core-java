class Jewellery {
	Jewellery() {
        System.out.println("Jewellery is invoked");
    }

	Jewellery(String type, String metal, String brand, double price, boolean isTraditional) {
		System.out.println("Jewellery parameterized constructor is invoked");
        this.type = type;
        this.metal = metal;
        this.brand = brand;
        this.price = price;
        this.isTraditional = isTraditional;
    }
    String type;
    String metal;
    String brand;
    double price;
    boolean isTraditional;
	
	public void getJewellInfo(){
		System.out.println("type is " + type);
        System.out.println("metal is " + metal);
        System.out.println("brand is " + brand);
        System.out.println("price is " + price);
        System.out.println("isTraditional is " + isTraditional);
	}
}