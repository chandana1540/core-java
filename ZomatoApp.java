class ZomatoApp{
	public static double getFoodCost(String foodName){
		double cost = 0.0;
		if(foodName=="bajji"){
			cost = 30.00;
		}else if(foodName=="RiceBath"){
			cost = 60.00;
		}else if(foodName=="Vegetable Samosa"){
			cost = 20.00;
		}else if(foodName=="Chicken 65"){
			cost = 80.00;
		}else if(foodName=="French Fries"){
			cost = 90.00;		
		}else if(foodName=="Onion Rings"){
			cost = 45.35;		
		}else if(foodName=="Vegetable Spring Rolls"){
			cost = 80.00;		
		}else if(foodName=="Chicken lolipop"){
			cost = 120.00;
		}else if(foodName=="Cheese Maggi"){
			cost = 50.00;
		}else if(foodName=="Corn Chat"){
			cost = 25.00;
		}else if(foodName=="Veggi Burger"){
			cost = 96.00;
		}else if(foodName=="Chicken Burger"){
			cost = 100.20;
		}else if(foodName=="Paneer tikka"){
			cost = 130.00;
		}else if(foodName=="Chicken tikka"){
			cost = 150.00;
		}else if(foodName=="Butter Naan"){
			cost = 30.00;
		}else if(foodName=="Palak Paneer"){
			cost = 45.00;
		}else if(foodName=="Veg fried Rice"){
			cost = 70.00;
		}else if(foodName=="Veg Noodles"){
			cost = 90.00;
		}else if(foodName=="Paneer Manchurian"){
			cost = 120.00;
		}else if(foodName=="Egg Rice"){
			cost = 90.00;
		}else if(foodName=="Jeera Rice"){
			cost = 130.00;
		}else if(foodName=="Pasta"){
			cost = 110.00;
		}else if(foodName=="Rice Sambar"){
			cost = 120.00;
		}else if(foodName=="North Meals"){
			cost = 180.00;
		}else if(foodName=="Uppit"){
			cost = 70.00;
		}else if(foodName=="Kara Pongal"){
			cost = 80.00;
		}else if(foodName=="Sweet Pongal"){
			cost = 60.00;
		}else if(foodName=="KesariBath"){
			cost = 50.00;
		}else if(foodName=="Paluv"){
			cost = 75.00;
		}else if(foodName=="Bonda"){
			cost = 40.00;
        } else System.out.println(foodName + " is Invalid ");
        return cost;
	    }
}	