class Weapon {
	public Weapon() {
        System.out.println("Weapon is invoked");
    }

    public Weapon(String name, String type, double weight, double price, String material, boolean isLicensed) {
		System.out.println("Weapon parameterized constructor is invoked");
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.material = material;
        this.isLicensed = isLicensed;
    }
    String name;
    String type;
    double weight;
    double price;
    String material;
    boolean isLicensed;
	
	public void getWeaponInfo(){
		System.out.println("name is " + name);
        System.out.println("type is " + type);
        System.out.println("weight is " + weight);
        System.out.println("price is " + price);
        System.out.println("material is " + material);
        System.out.println("isLicensed is " + isLicensed);
	}
		
}
