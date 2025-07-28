class Flowers {
	
	Flowers() {
        System.out.println("Flower is invoked");
    }
    Flowers(String name, String color, double price, String fragrance, String season, boolean isMedicinal) {
        System.out.println("Flowers parameterized constructor is invoked");
        this.name = name;
        this.color = color;
        this.price = price;
        this.fragrance = fragrance;
        this.season = season;
        this.isMedicinal = isMedicinal;
    }

    String name;
    String color;
    double price;
    String fragrance;
    String season;
    boolean isMedicinal;
	
	public void getFlowersInfo(){
		System.out.println("name is " + name);
        System.out.println("color is " + color);
        System.out.println("price is " + price);
        System.out.println("fragrance is " + fragrance);
        System.out.println("season is " + season);
        System.out.println("isMedicinal is " + isMedicinal);
	}
}
