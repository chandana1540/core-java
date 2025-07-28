class Marble {
	Marble() {
        System.out.println("Marble is Invoked");
    }

    Marble(String color, String type, String brand, double price, String material, boolean isTransparent) {
		System.out.println("Marble parameterized constructor is invoked");
        this.color = color;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.isTransparent = isTransparent;
    }
    String color;
    String type;
    String brand;
    double price;
    String material;
    boolean isTransparent;
	
	public void getMarbleInfo(){
		System.out.println("color is " + color);
        System.out.println("type is " + type);
        System.out.println("brand is " + brand);
        System.out.println("price is " + price);
        System.out.println("material is " + material);
        System.out.println("isTransparent is " + isTransparent);
	}
}
