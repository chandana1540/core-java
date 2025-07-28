class GiTag {
	GiTag() {
		System.out.println("GiTag is invoked");
    }
	GiTag(String product, String state, String category, int yearOfRegistration, boolean isHandmade) {
		System.out.println("GiTag parameterized constructor is invoked");
        this.product = product;
        this.state = state;
        this.category = category;
        this.yearOfRegistration = yearOfRegistration;
        this.isHandmade = isHandmade;
    }
    String product;
    String state;
    String category;
    int yearOfRegistration;
    boolean isHandmade;
	
	public void getGiTagInfo(){
		System.out.println("product is " + product);
        System.out.println("state is " + state);
        System.out.println("category is " + category);
        System.out.println("yearOfRegistration is " + yearOfRegistration);
        System.out.println("isHandmade is " +isHandmade);
	}
		
}
