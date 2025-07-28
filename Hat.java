class Hat {
	 Hat() {
        System.out.println("Hat is Invoked");
    }

    Hat(String color, String type, String brand, double price, String material, boolean isAdjustable) {
		System.out.println("Hat parameterized constructor is invoked");
        this.color = color;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.isAdjustable = isAdjustable;
    }
    String color;
    String type;
    String brand;
    double price;
    String material;
    boolean isAdjustable;
	
	public void getHatInfo(){
		System.out.println("color is " + color);
        System.out.println("type is " + type);
        System.out.println("brand is " + brand);
        System.out.println("price is " + price);
        System.out.println("material is " + material);
        System.out.println("isAdjustable is " + isAdjustable);
	}
}