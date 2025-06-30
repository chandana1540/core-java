class SuperMarket {
	static String iceCreams[] = {"Straberry","vanilla","Butterscotch","Chocobar","ConeIce","chocolate","Faluda","Arunice","kulfi","Mango"};
	static String perfumes[] = {"Lotus","Fog","RoseSmith","Lyrical","DenVer","Smoky","Engage","envy","Wildstone","WaterGirl"};
	static String groceries[] = {"oil","Shampoo","curd","Ghee","Milk","Biscuit","WeatFlour","Maida","CornFlour","Choclate"};
	static String cosmetics[] = {"FaceWash","RosePowder","Foundation","Sunscreen","NailPolish","NailPolishRemover","RoseWater","FairnessCream","Lipstick","Eyelyner"};
	    public static void main(String Market[]) {
		//System.out.println("The Number Of iceCreams Are "+iceCreams.length);
		//System.out.println(iceCreams[0]+" "+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+" "+iceCreams[9]);
		//System.out.println("The Number Of perfumes Are "+perfumes.length);
		//System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+perfumes[4]+" "+perfumes[5]+" "+perfumes[6]+" "+perfumes[7]+" "+perfumes[8]+" "+perfumes[9]);
		//System.out.println("The Number Of cosmetics Are "+cosmetics.length);
		//System.out.println(cosmetics[0]+" "+cosmetics[1]+" "+cosmetics[2]+" "+cosmetics[3]+" "+cosmetics[4]+" "+cosmetics[5]+" "+cosmetics[6]+" "+cosmetics[7]+" "+cosmetics[8]+" "+cosmetics[9]);
	    System.out.println("Main Started");
		System.out.println("Are icecreams available in the SuperMarket Are:");
		for(String  iceCream : iceCreams) {
			System.out.println(iceCream);
		}
		System.out.println("Are perfumes available in the SuperMarket Are:");
		for(String perfume : perfumes) {
			System.out.println(perfume);
		}
		System.out.println("Are groceries available in the SuperMarket Are:");
		for(String grocerie : groceries) {
			System.out.println(grocerie);
		}
		System.out.println("Are cosmetics available in the SuperMarket Are:");
		for(String cosmetic : cosmetics) {
			System.out.println(cosmetic);
		}
		System.out.println("Main Ended");
}
}




// int index = no of elements(length-1)
