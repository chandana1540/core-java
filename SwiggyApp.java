class SwiggyApp {
	public static double  getfoodCost(String foodName){
	double Cost = 0.0;
        if(foodName == "Mini Idli"){
		Cost = 79.00;
	    }else if(foodName == "Butter Masala Dosa"){
		Cost = 95.00;
	    }else if(foodName == "Bun Butter Jam"){
		Cost = 30.00;
	    }else if(foodName == "Tea"){
		Cost = 30.00;
		}else if(foodName == "Coffee"){
		Cost = 40.00;
		}else if(foodName == "Small Samosa"){
		Cost = 20.00;
		}else if(foodName == "Plain Dosa"){
		Cost = 60.00;
		}else if(foodName == "Onion Pakoda"){
		Cost = 50.00;
		}else if(foodName == "Puri"){
		Cost = 45.00;
		}else if(foodName == "Veg Puff"){
		Cost = 69.00;
		}else if(foodName == "Masala Puri"){
		Cost = 55.00;
		}else if(foodName == "Sweet Lassi"){
		Cost = 70.00;
		}else if(foodName == "Filter Coffee"){
		Cost = 40.00;
		}else if(foodName == "Plain Rava Idli"){
		Cost = 40.00;
		}else if(foodName == "Lemon Tea"){
		Cost = 79.00;
		}else if(foodName == "Small Vada"){
		Cost = 20.00;
		}else if(foodName == "Veg Noodles"){
		Cost = 99.00;
		}else if(foodName == "Veg Fried Rice"){
		Cost = 99.00;
		}else if(foodName == "Chilli Chicken"){
		Cost = 95.00;
		}else if(foodName == "Chicken Biryani"){
		Cost = 92.00;
		}else if(foodName == "Chicken65"){
		Cost = 140.00;
		}else if(foodName == "Veg Biryani"){
		Cost = 169.00;
		}else if(foodName == "Noodles"){
		Cost = 120.00;
		}else if(foodName == "Fried Rice"){
		Cost = 130.00;
		}else if(foodName == "Paneer Butter Masala"){
		Cost = 150.00;
		}else if(foodName == "Dal Makhani"){
		Cost = 140.00;
		}else if(foodName == "Gobi Manchurian"){
		Cost = 130.00;
		}else if(foodName == "Mutton Biryani"){
		Cost = 200.00;
		}else if(foodName == "Boiled Egg"){
		Cost = 15.00;
		}else if(foodName == "Thali"){
		Cost = 150.00;	
	    }else System.out.println(foodName + "is Invalid");
	    return Cost;
	    }
}