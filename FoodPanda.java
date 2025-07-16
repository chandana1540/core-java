class FoodPanda {
	public static double search(String foodName){
		double price = 0.0;
		if(foodName == "Egg Masala"){
			price = 60.67;
			return price;
		}else if(foodName == "Puff"){
			price = 30.98;
			return price;
		}else if(foodName == "Veggi Spring Rolls"){
			price = 50.58;
			return price;
		}else if(foodName == "Chicken lolipop"){
			price = 120.08;
			return price;
		}else if(foodName == "Veg Thali"){
			price = 30.00;
			return price;
		}else if(foodName == "Burger"){
			price = 60.00;
			return price;
		}else if(foodName == "Pizza"){
			price = 140.00;
			return price;
		}else if(foodName == "Pasta"){
			price = 140.00;
			return price;
		}else if(foodName == "Samosa"){
			price = 30.00;
			return price;
		}else if(foodName == "Buritto"){
			price = 35.00;
			return price;
		}else if(foodName == "Fried Chicken"){
			price = 48.90;
			return price;
		}else if(foodName == "Sandwich"){
			price = 50.00;
			return price;
		}else if(foodName == "Momos"){
			price = 60.00;
			return price;
		}else if(foodName == "Ramen"){
			price = 80.00;
			return price;
		}else if(foodName == "Doner Kebab"){
			price = 75.08;
			return price;
		}else if(foodName == "Fried Fish"){
			price = 120.00;
			return price;
		}else if(foodName == "Garlic Bread"){
			price = 40.00;
			return price;
		}else if(foodName == "Salad"){
			price = 26.23;
			return price;
		}else if(foodName == "Nachos"){
			price = 29.98;
			return price;
		}else if(foodName == "Hummus"){
			price = 70.00;
			return price;
		}else if(foodName == "Pita"){
			price = 40.00;
			return price;
		}else if(foodName == "Spring Rolls"){
			price = 25.00;
			return price;
		}else if(foodName == "Mashed Potatoes"){
			price = 40.00;
			return price;
		}else if(foodName == "Steak"){
			price = 50.00;
			return price;
		}else if(foodName == "Dim Sum"){
			price = 60.00;
			return price;
		}else if(foodName == "Lobster Roll"){
			price = 45.00;
			return price;
		}else if(foodName == "SeaFood Platter"){
			price = 97.03;
			return price;
		}else if(foodName == "Gluten free Pizza"){
			price = 160.00;
			return price;
		}else if(foodName == "Truffle Fries"){
			price = 30.00;
			return price;
		}else if(foodName == "Curd Rice"){
			price = 100.08;
			return price;
		}else System.out.println(foodName+ "is inValid");
	    return price;
	}
    public static double search(String foodName, int quantity){
		double price = 0.0;
		if(foodName == "Egg Masala"){
			price = 60.67*quantity;
			return price;
		}else if(foodName == "Puff"){
			price = 30.98*quantity;
			return price;
		}else if(foodName == "Veggi Spring Rolls"){
			price = 50.58*quantity;
			return price;
		}else if(foodName == "Chicken lolipop"){
			price = 120.08*quantity;
			return price;
		}else if(foodName == "Veg Thali"){
			price = 30.00*quantity;
			return price;
		}else if(foodName == "Burger"){
			price = 60.00*quantity;
			return price;
		}else if(foodName == "Pizza"){
			price = 140.00*quantity;
			return price;
		}else if(foodName == "Pasta"){
			price = 140.00*quantity;
			return price;
		}else if(foodName == "Samosa"){
			price = 30.00*quantity;
			return price;
		}else if(foodName == "Buritto"){
			price = 35.00*quantity;
			return price;
		}else if(foodName == "Fried Chicken"){
			price = 48.90*quantity;
			return price;
		}else if(foodName == "Sandwich"){
			price = 50.00*quantity;
			return price;
		}else if(foodName == "Momos"){
			price = 60.00*quantity;
			return price;
		}else if(foodName == "Ramen"){
			price = 80.00*quantity;
			return price;
		}else if(foodName == "Doner Kebab"){
			price = 75.08*quantity;
			return price;
		}else if(foodName == "Fried Fish"){
			price = 120.00*quantity;
			return price;
		}else if(foodName == "Garlic Bread"){
			price = 40.00*quantity;
			return price;
		}else if(foodName == "Salad"){
			price = 26.23*quantity;
			return price;
		}else if(foodName == "Nachos"){
			price = 29.98*quantity;
			return price;
		}else if(foodName == "Hummus"){
			price = 70.00*quantity;
			return price;
		}else if(foodName == "Pita"){
			price = 40.00*quantity;
			return price;
		}else if(foodName == "Spring Rolls"){
			price = 25.00*quantity;
			return price;
		}else if(foodName == "Mashed Potatoes"){
			price = 40.00*quantity;
			return price;
		}else if(foodName == "Steak"){
			price = 50.00*quantity;
			return price;
		}else if(foodName == "Dim Sum"){
			price = 60.00*quantity;
			return price;
		}else if(foodName == "Lobster Roll"){
			price = 45.00*quantity;
			return price;
		}else if(foodName == "SeaFood Platter"){
			price = 97.03*quantity;
			return price;
		}else if(foodName == "Gluten free Pizza"){
			price = 160.00*quantity;
			return price;
		}else if(foodName == "Truffle Fries"){
			price = 30.00*quantity;
			return price;
		}else if(foodName == "Curd Rice"){
			price = 100.08*quantity;
			return price;
		}else System.out.println("food not found");
	    return price;
	}
}
		
		
		