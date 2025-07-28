class Crackers {
	
	Crackers() {
        System.out.println("Crackers is invoked ");
    }
    Crackers(String name, String type, String color, double price, String brand, boolean isLoud) {
		System.out.println("Crackers parameterized constructor is invoked");
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.isLoud = isLoud;
    }
    String name;
    String type;
    String color;
    double price;
    String brand;
    boolean isLoud;
	
	public void getCrackersInfo(){
		System.out.println("name is " +name);
        System.out.println("type is " +type);
        System.out.println("color is " +color);
        System.out.println("price is " +price);
        System.out.println("brand is " +brand);
        System.out.println("isLoud is " +isLoud);
	}
}
