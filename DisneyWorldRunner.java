class DisneyWorldRunner {
public static void main(String disney[]){

String name = DisneyWorld.getName();
System.out.println("The Name of a DisneyWorld is "+name);

int noOfRooms = DisneyWorld.getNoOfRooms();
System.out.println("The noOfRooms in DisneyWorld is "+noOfRooms);

float mealPrice = DisneyWorld.getMealPrice();
System.out.println("The mealPrice of DisneyWorld is "+mealPrice);

boolean isItOutdoors = DisneyWorld.getIsItOutdoors();
System.out.println("The DisneyWorld isItOutdoors "+isItOutdoors);

char category = DisneyWorld.getCategory();
System.out.println("The Category of DisneyWorld "+category);
}
}