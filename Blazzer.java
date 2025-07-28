class Blazzer {
	
	Blazzer(){
		System.out.println("The Blazzer is Invoked");
	}
	Blazzer(String brand, String color, String size, double price, String material , boolean isFormal){
		System.out.println("Blazzer Parameterised cons is invoked");
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
		this.material = material;
		this.isFormal = isFormal;
	}
    String brand;
    String color;
    String size;
    double price;
    String material;
    boolean isFormal;
	
	public void getBlazzerInfo(){
		System.out.println("brand  is "+brand);
        System.out.println("color  is "+color);
        System.out.println("size  is "+size);
        System.out.println("price  is "+price);
        System.out.println("material  is "+material);
        System.out.println("isFormal  is "+isFormal);
		
}
}