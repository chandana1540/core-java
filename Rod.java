class Rod {
	 Rod() {
        System.out.println("Rod  is invoked");
    }

    Rod(String material, double length, double diameter, String brand, double price, boolean isFlexible) {
        System.out.println("Rod parameterized constructor is invoked");
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.brand = brand;
        this.price = price;
        this.isFlexible = isFlexible;
    }
    String material;
    double length;
    double diameter;
    String brand;
    double price;
    boolean isFlexible;
	
	public void getRodInfo(){
		System.out.println("material is " + material);
        System.out.println("length is " + length);
        System.out.println("diameter is " + diameter);
        System.out.println("brand is " + brand);
        System.out.println("price is " + price);
        System.out.println("isFlexible is " + isFlexible);
	}
		
}
