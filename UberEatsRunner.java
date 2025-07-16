class UberEatsRunner {
	public static void main (String chand[]){
	String foodName = "SavigeBath";
    double price = UberEats.search(foodName);
    
	int quantity = 3;
	double pricewithquantity = UberEats.search(foodName,quantity);
	System.out.println(" The FoodName bought is " +foodName+ " with quantity of " +quantity+ " and cost is "+pricewithquantity);
	
	}
}

	
    	
