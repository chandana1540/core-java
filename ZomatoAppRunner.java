class ZomatoAppRunner{
	public static void main(String chand[]){
		String foodName = "RiceBath";
		double cost = ZomatoApp.search(foodName);
		System.out.println("The foodName is "+foodName+" with price of "+cost);
        int quantity = 2;
		double priceWithQuantity = ZomatoApp.search(foodName,quantity);
		System.out.println(" The FoodName bought is " +foodName+ " price with quantity of " +quantity+ " and their cost is "+cost);
	}
}
