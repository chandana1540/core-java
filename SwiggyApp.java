class SwiggyApp {
	public static double search(String foodName){
	double Cost = 0.0;
        if(foodName == "Mini Idli"){
		Cost = 79.00;
		return Cost;
	    }else if(foodName == "Butter Masala Dosa"){
		Cost = 95.00;
		return Cost;
	    }else if(foodName == "Bun Butter Jam"){
		Cost = 30.00;
		return Cost;
	    }else if(foodName == "Tea"){
		Cost = 30.00;
		return Cost;
		}else if(foodName == "Coffee"){
		Cost = 40.00;
		return Cost;
		}else if(foodName == "Small Samosa"){
		Cost = 20.00;
		return Cost;
		}else if(foodName == "Plain Dosa"){
		Cost = 60.00;
		return Cost;
		}else if(foodName == "Onion Pakoda"){
		Cost = 50.00;
		return Cost;
		}else if(foodName == "Puri"){
		Cost = 45.00;
		return Cost;
		}else if(foodName == "Veg Puff"){
		Cost = 69.00;
		return Cost;
		}else if(foodName == "Masala Puri"){
		Cost = 55.00;
		return Cost;
		}else if(foodName == "Sweet Lassi"){
		Cost = 70.00;
		return Cost;
		}else if(foodName == "Filter Coffee"){
		Cost = 40.00;
		return Cost;
		}else if(foodName == "Plain Rava Idli"){
		Cost = 40.00;
		return Cost;
		}else if(foodName == "Lemon Tea"){
		Cost = 79.00;
		return Cost;
		}else if(foodName == "Small Vada"){
		Cost = 20.00;
		return Cost;
		}else if(foodName == "Veg Noodles"){
		Cost = 99.00;
		return Cost;
		}else if(foodName == "Veg Fried Rice"){
		Cost = 99.00;
		return Cost;
		}else if(foodName == "Chilli Chicken"){
		Cost = 95.00;
		return Cost;
		}else if(foodName == "Chicken Biryani"){
		Cost = 92.00;
		return Cost;
		}else if(foodName == "Chicken65"){
		Cost = 140.00;
		return Cost;
		}else if(foodName == "Veg Biryani"){
		Cost = 169.00;
		return Cost;
		}else if(foodName == "Noodles"){
		Cost = 120.00;
		return Cost;
		}else if(foodName == "Fried Rice"){
		Cost = 130.00;
		return Cost;
		}else if(foodName == "Paneer Butter Masala"){
		Cost = 150.00;
		return Cost;
		}else if(foodName == "Dal Makhani"){
		Cost = 140.00;
		return Cost;
		}else if(foodName == "Gobi Manchurian"){
		Cost = 130.00;
		return Cost;
		}else if(foodName == "Mutton Biryani"){
		Cost = 200.00;
		return Cost;
		}else if(foodName == "Boiled Egg"){
		Cost = 15.00;
		return Cost;
		}else if(foodName == "Thali"){
		Cost = 150.00;
        return Cost;		
	    }else System.out.println(foodName + "is Invalid");
	    return Cost;
	    }
public static double search(String foodName, int quantity){
	double Cost = 0.0;
        if(foodName == "Mini Idli"){
		Cost = 79.00;
		return Cost*quantity;
	    }else if(foodName == "Butter Masala Dosa"){
		Cost = 95.00;
		return Cost*quantity;
	    }else if(foodName == "Bun Butter Jam"){
		Cost = 30.00;
		return Cost*quantity;
	    }else if(foodName == "Tea"){
		Cost = 30.00;
		return Cost*quantity;
		}else if(foodName == "Coffee"){
		Cost = 40.00;
		return Cost*quantity;
		}else if(foodName == "Small Samosa"){
		Cost = 20.00;
		return Cost*quantity;
		}else if(foodName == "Plain Dosa"){
		Cost = 60.00;
		return Cost*quantity;
		}else if(foodName == "Onion Pakoda"){
		Cost = 50.00;
		return Cost*quantity;
		}else if(foodName == "Puri"){
		Cost = 45.00;
		return Cost*quantity;
		}else if(foodName == "Veg Puff"){
		Cost = 69.00;
		return Cost*quantity;
		}else if(foodName == "Masala Puri"){
		Cost = 55.00;
		return Cost*quantity;
		}else if(foodName == "Sweet Lassi"){
		Cost = 70.00;
		return Cost*quantity;
		}else if(foodName == "Filter Coffee"){
		Cost = 40.00;
		return Cost*quantity;
		}else if(foodName == "Plain Rava Idli"){
		Cost = 40.00;
		return Cost*quantity;
		}else if(foodName == "Lemon Tea"){
		Cost = 79.00;
		return Cost*quantity;
		}else if(foodName == "Small Vada"){
		Cost = 20.00;
		return Cost*quantity;
		}else if(foodName == "Veg Noodles"){
		Cost = 99.00;
		return Cost*quantity;
		}else if(foodName == "Veg Fried Rice"){
		Cost = 99.00;
		return Cost*quantity;
		}else if(foodName == "Chilli Chicken"){
		Cost = 95.00;
		return Cost*quantity;
		}else if(foodName == "Chicken Biryani"){
		Cost = 92.00;
		return Cost*quantity;
		}else if(foodName == "Chicken65"){
		Cost = 140.00;
		return Cost*quantity;
		}else if(foodName == "Veg Biryani"){
		Cost = 169.00;
		return Cost*quantity;
		}else if(foodName == "Noodles"){
		Cost = 120.00;
		return Cost*quantity;
		}else if(foodName == "Fried Rice"){
		Cost = 130.00;
		return Cost*quantity;
		}else if(foodName == "Paneer Butter Masala"){
		Cost = 150.00;
		return Cost*quantity;
		}else if(foodName == "Dal Makhani"){
		Cost = 140.00;
		return Cost*quantity;
		}else if(foodName == "Gobi Manchurian"){
		Cost = 130.00;
		return Cost*quantity;
		}else if(foodName == "Mutton Biryani"){
		Cost = 200.00;
		return Cost*quantity;
		}else if(foodName == "Boiled Egg"){
		Cost = 15.00;
		return Cost*quantity;
		}else if(foodName == "Thali"){
		Cost = 150.00;
        return Cost*quantity;		
	    }else System.out.println(foodName + "is Invalid");
	    return Cost;
	    }
}