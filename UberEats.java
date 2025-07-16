class UberEats{
	public static double getFoodCost(String foodName){
		double cost = 0.0;
		if(foodName == "Veg kurma"){
			cost = 65.03;
		}else if(foodName == "SavigeBath"){
			cost = 45.06;
		}else if(foodName == "KaraBath"){
			cost = 70.00;
		}else if(foodName == "Roti"){
			cost = 20.00;
		}else if(foodName == "Chappati"){
			cost = 25.00;
		}else if(foodName == "Parota"){
			cost = 15.00;
		}else if(foodName == "Paneer Curry"){
			cost = 60.00;
		}else if(foodName == "Masala Dosa"){
			cost = 30.00;
		}else if(foodName == "Chakna fry"){
			cost = 80.00;
		}else if(foodName == "Jamun"){
			cost = 12.35;
		}else if(foodName == "Sweet"){
			cost = 25.00;
		}else if(foodName == "Mushroom Kabab"){
			cost = 60.00;
		}else if(foodName == "Jeera Rice"){
			cost = 130.00;
		}else if(foodName == "Fried Rice"){
			cost = 120.00;
		}else if(foodName == "veg Uppit"){
			cost = 55.00;
		}else if(foodName == "Vada"){
			cost = 20.00;
		}else if(foodName == "bonda"){
			cost = 15.00;
		}else if(foodName == "Veg Soup"){
			cost = 30.00;
		}else if(foodName == "corn Fry"){
			cost = 40.00;
		}else if(foodName == "Puri"){
			cost = 30.00;
		}else if(foodName == "Puliyogre"){
			cost = 40.00;
		}else if(foodName == "LemonRice"){
			cost = 35.00;
		}else if(foodName == "Mango Dosa"){
			cost = 40.00;
		}else if(foodName == "Girmit"){
			cost = 35.00;
		}else if(foodName == "Pani Puri"){
			cost = 40.00;
		}else if(foodName == "Baby Corn Manchurian"){
			cost = 30.00;
		}else if(foodName == "northern meals"){
			cost = 130.00;
		}else if(foodName == "Southern Meals"){
			cost = 125.00;
		}else if(foodName == "beeda"){
			cost = 15.00;
		}else if(foodName == "Rasgoola"){
			cost = 25.00;
		}else System.out.println(foodName + "The Food  Is Invalid ");
	    return cost;
	}
}