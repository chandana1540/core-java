class Weapon {
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
