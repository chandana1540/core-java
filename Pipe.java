class Pipe {
	Pipe() {
        System.out.println("Pipe is invoked");
    }
	
	Pipe(String material, double length, double diameter, String color, String brand, boolean isFlexible) {
		System.out.println("Pipe parameterized constructor is invoked");
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.color = color;
        this.brand = brand;
        this.isFlexible = isFlexible;
    }
    String material;
    double length;
    double diameter;
    String color;
    String brand;
    boolean isFlexible;
	
	public void getPipeInfo(){
		System.out.println("material is " + material);
        System.out.println("length is " + length);
        System.out.println("diameter is " + diameter);
        System.out.println("color is " + color);
        System.out.println("brand is " + brand);
        System.out.println("isFlexible is " + isFlexible);
	}
}