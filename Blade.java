class Blade{
	
	Blade(){
		System.out.println("The Blade is Invoked");
	}
	
	Blade(String type, String color, boolean sharpness, double price, String brand, double length){
		System.out.println("Blade Parameterised cons is invoked");
		this.type = type;
		this.color = color;
		this.sharpness = sharpness;
		this.price = price;
		this.brand = brand;
		this.length = length;
	}
	
	String type;
	String color;
	boolean sharpness;
	double price;
	String brand;
	double length;
	
	public void getBladeDetails(){
		
    System.out.println("type  is "+type);
    System.out.println("color  is "+color);
    System.out.println("sharpness  is "+sharpness);
    System.out.println("price  is "+price);
    System.out.println("brand  is "+brand);
    System.out.println("length  is "+length);
	}
}