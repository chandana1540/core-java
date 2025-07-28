class GymEquipment {
    String name;
    String type;
    double weight;
    String brand;
    double price;
    boolean isAdjustable;
	
	GymEquipment() {
        System.out.println("GymEquipment is Invoked");
    }

    GymEquipment(String name, String type, double weight, String brand, double price, boolean isAdjustable) {
		System.out.println("GymEquipment parameterized constructor is invoked");
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.brand = brand;
        this.price = price;
        this.isAdjustable = isAdjustable;
    }

	
	public void getGymInfo(){
		System.out.println("name is " + name);
        System.out.println("type is " + type);
        System.out.println("weight is " + weight);
        System.out.println("brand is " + brand);
        System.out.println("price is " + price);
        System.out.println("isAdjustable is " + isAdjustable);
	}
}
