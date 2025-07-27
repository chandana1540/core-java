class Pipe {
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