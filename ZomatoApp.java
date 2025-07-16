class ZomatoApp{
	public static double search(String foodName){
		double cost = 0.0;
		if(foodName=="bajji"){
			cost = 30.00;
			return cost;
		}else if(foodName=="RiceBath"){
			cost = 60.00;
			return cost;
		}else if(foodName=="Vegetable Samosa"){
			cost = 20.00;
			return cost;
		}else if(foodName=="Chicken 65"){
			cost = 80.00;
			return cost;
		}else if(foodName=="French Fries"){
			cost = 90.00;
            return cost;			
		}else if(foodName=="Onion Rings"){
			cost = 45.35;
            return cost; 			
		}else if(foodName=="Vegetable Spring Rolls"){
			cost = 80.00;
            return cost;			
		}else if(foodName=="Chicken lolipop"){
			cost = 120.00;
			return cost;
		}else if(foodName=="Cheese Maggi"){
			cost = 50.00;
			return cost;
		}else if(foodName=="Corn Chat"){
			cost = 25.00;
			return cost;
		}else if(foodName=="Veggi Burger"){
			cost = 96.00;
			return cost;
		}else if(foodName=="Chicken Burger"){
			cost = 100.20;
			 return cost;
		}else if(foodName=="Paneer tikka"){
			cost = 130.00;
			 return cost;
		}else if(foodName=="Chicken tikka"){
			cost = 150.00;
			 return cost;
		}else if(foodName=="Butter Naan"){
			cost = 30.00;
			 return cost;
		}else if(foodName=="Palak Paneer"){
			cost = 45.00;
			 return cost;
		}else if(foodName=="Veg fried Rice"){
			cost = 70.00;
			return cost;
		}else if(foodName=="Veg Noodles"){
			cost = 90.00;
			return cost;
		}else if(foodName=="Paneer Manchurian"){
			cost = 120.00;
			return cost;
		}else if(foodName=="Egg Rice"){
			cost = 90.00;
			return cost;
		}else if(foodName=="Jeera Rice"){
			cost = 130.00;
			return cost;
		}else if(foodName=="Pasta"){
			cost = 110.00;
			return cost;
		}else if(foodName=="Rice Sambar"){
			cost = 120.00;
			return cost;
		}else if(foodName=="North Meals"){
			cost = 180.00;
			return cost;
		}else if(foodName=="Uppit"){
			cost = 70.00;
			return cost;
		}else if(foodName=="Kara Pongal"){
			cost = 80.00;
			return cost;
		}else if(foodName=="Sweet Pongal"){
			cost = 60.00;
			return cost;
		}else if(foodName=="KesariBath"){
			cost = 50.00;
			return cost;
		}else if(foodName=="Paluv"){
			cost = 75.00;
			return cost;
		}else if(foodName=="Bonda"){
			cost = 40.00;
			return cost;
        } else System.out.println(foodName + " is Invalid ");
        return cost;
	    }	
	public static double search(String foodName, int quantity){
		double cost = 0.0;
		if(foodName=="bajji"){
			cost = 30.00;
			return cost*quantity;
		}else if(foodName=="RiceBath"){
			cost = 60.00;
			return cost*quantity;
		}else if(foodName=="Vegetable Samosa"){
			cost = 20.00;
			return cost*quantity;
		}else if(foodName=="Chicken 65"){
			cost = 80.00;
			return cost*quantity;
		}else if(foodName=="French Fries"){
			cost = 90.00;
            return cost*quantity;			
		}else if(foodName=="Onion Rings"){
			cost = 45.35;
            return cost*quantity; 			
		}else if(foodName=="Vegetable Spring Rolls"){
			cost = 80.00;
            return cost*quantity;			
		}else if(foodName=="Chicken lolipop"){
			cost = 120.00;
			return cost*quantity;
		}else if(foodName=="Cheese Maggi"){
			cost = 50.00;
			return cost*quantity;
		}else if(foodName=="Corn Chat"){
			cost = 25.00;
			return cost*quantity;
		}else if(foodName=="Veggi Burger"){
			cost = 96.00;
			return cost*quantity;
		}else if(foodName=="Chicken Burger"){
			cost = 100.20;
			 return cost*quantity;
		}else if(foodName=="Paneer tikka"){
			cost = 130.00;
			 return cost*quantity;
		}else if(foodName=="Chicken tikka"){
			cost = 150.00;
			 return cost*quantity;
		}else if(foodName=="Butter Naan"){
			cost = 30.00;
			 return cost*quantity;
		}else if(foodName=="Palak Paneer"){
			cost = 45.00;
			 return cost*quantity;
		}else if(foodName=="Veg fried Rice"){
			cost = 70.00;
			return cost*quantity;
		}else if(foodName=="Veg Noodles"){
			cost = 90.00;
			return cost*quantity;
		}else if(foodName=="Paneer Manchurian"){
			cost = 120.00;
			return cost*quantity;
		}else if(foodName=="Egg Rice"){
			cost = 90.00;
			return cost*quantity;
		}else if(foodName=="Jeera Rice"){
			cost = 130.00;
			return cost*quantity;
		}else if(foodName=="Pasta"){
			cost = 110.00;
			return cost*quantity;
		}else if(foodName=="Rice Sambar"){
			cost = 120.00;
			return cost*quantity;
		}else if(foodName=="North Meals"){
			cost = 180.00;
			return cost*quantity;
		}else if(foodName=="Uppit"){
			cost = 70.00;
			return cost*quantity;
		}else if(foodName=="Kara Pongal"){
			cost = 80.00;
			return cost*quantity;
		}else if(foodName=="Sweet Pongal"){
			cost = 60.00;
			return cost*quantity;
		}else if(foodName=="KesariBath"){
			cost = 50.00;
			return cost*quantity;
		}else if(foodName=="Paluv"){
			cost = 75.00;
			return cost*quantity;
		}else if(foodName=="Bonda"){
			cost = 40.00;
			return cost*quantity;
        } else System.out.println("food not found");
        return cost;
	    }
}		