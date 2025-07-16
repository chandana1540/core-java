class KfcRunner{
	public static void main(String chand[]){
		String mealName = "Popcorn Chicken";
		double price = Kfc.search(mealName);
		System.out.println("The meal name is " +mealName+ " with price is " +price);
		int quantity = 5;
		double priceWithQuantity = Kfc.search(mealName,quantity);
		System.out.println(" The MealName Bought is "+mealName+" priceWithQuantity "+quantity+ " is "+price);
	}
}
