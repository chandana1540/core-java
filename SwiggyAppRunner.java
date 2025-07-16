class SwiggyAppRunner {
	public static void main(String swiggy[]){
		//double price;
		String foodName = "Mini Idli";
		 double price = SwiggyApp.search(foodName);
		System.out.println("The cost of "+foodName+" is "+price);
		int quantity = 6;
		double pricewithquantity = SwiggyApp.search(foodName,quantity);
		System.out.println("The FoodName Bought is "+foodName+" pricewithquantity "+quantity+" is "+pricewithquantity);
		
	}
}
