class Kfc{
	public static double getmealPrice(String mealName){
    double Price = 0.0;
    if(mealName == "Wednesday Bucket"){
    Price = 699.05;
    }else if(mealName == "Strips Bucket"){
    Price = 350.48;
    }else if(mealName == "5pc Leg peice Bucket"){
    Price = 628.57;
    }else if(mealName == "10 pc Leg Peice Bucket"){
    Price = 628.57;
    }else if(mealName == "Stay Home Bucket"){
    Price = 788.57;
    }else if(mealName == "2Dips leg"){
    Price = 515.24;
    }else if(mealName == "Family Fest"){
    Price = 828.57;
    }else if(mealName == "Ultimate Savings Bucket"){
    Price = 699.05;
    }else if(mealName == "Big 12"){
    Price = 719.05;
    }else if(mealName == "Mingles Bucket"){
    Price = 345.09;	
	}else if(mealName == "8pc Hot Crispy And Chicken"){
    Price = 437.00;
	}else if(mealName == "Zinger Bucket"){
    Price = 340.09;
	}else if(mealName == "Twister Bucket"){
    Price = 230.10;
	}else if(mealName == "Double Down Burger"){
    Price = 628.57;
	}else if(mealName == "Zinger Burger"){
    Price = 200.08;
	}else if(mealName == "Chilli Chicken burger"){
    Price = 300.00;
	}else if(mealName == "Veg Zinger"){
    Price = 150.00;
	}else if(mealName == "Veg Burger"){
    Price = 135.00;
	}else if(mealName == "Double Chicken Roll"){
    Price = 120.00;
	}else if(mealName == "Class Chicken Roll"){
    Price = 250.00;
	}else if(mealName == "Ricz Bowlz"){
    Price = 130.00;
	}else if(mealName == "pepsi"){
    Price = 125.00;
	}else if(mealName == "Mountain Dew"){
    Price = 320.00;
	}else if(mealName == "Soft Drinks"){
    Price = 240.87;
	}else if(mealName == "Milk Shakes"){
    Price = 230.00;
	}else if(mealName == "Brownies"){
    Price = 30.00;
	}else if(mealName == "Chicken Strips"){
    Price = 40.00;
	}else if(mealName == "Hot Wings"){
    Price = 80.00;
	}else if(mealName == "peri peri Chicken"){
    Price = 96.00;
	}else if(mealName == "Smoky Red Chicken"){
    Price = 45.00;
	}else if(mealName == "Popcorn Chicken"){
    Price = 90.00;
	}else if(mealName == "Onion Rings"){
    Price = 60.00;
	} else System.out.println(mealName + "is Invalid");
	return Price;
	}
}
	