class FoodPandaRunner {
	public static void main(String chand[]){
		String foodName = "Pizza";
		double Cost = FoodPanda.search(foodName);
		System.out.println("The foodName is "+foodName+" with price of "+Cost);
        int quantity = 3;
		double priceWithQuantity = FoodPanda.search(foodName,quantity);
		System.out.println(" The FoodName bought is " +foodName+ " price with quantity of " +quantity+ " and their cost is "+priceWithQuantity);
	}
}
