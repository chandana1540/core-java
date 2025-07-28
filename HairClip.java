class HairClip {
	
	HairClip() {
        System.out.println("HairClip is invoked");
    }
	
    HairClip(String color, String type, String brand, double price, String material, boolean isDecorated) {
		System.out.println("HairClip parameterized constructor is invoked");
        this.color = color;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.material = material;
        this.isDecorated = isDecorated;
    }
    String color;
    String type;
    String brand;
    double price;
    String material;
    boolean isDecorated;
	
	public void getHairClipInfo(){
		System.out.println("color is " +color);
        System.out.println("type is " + type);
        System.out.println("brand is " + brand);
        System.out.println("price is " + price);
        System.out.println("material is " + material);
        System.out.println("isDecorated is " + isDecorated);
	}
}
