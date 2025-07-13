class MarketRunner{
public static void main(String market[]){
String location = Market.getLocation();
System.out.println("The Location of a Market is "+location);
int areaSize = Market.getAreaSize();
System.out.println("The size of this market is "+areaSize);
float width = Market.getWidth();
System.out.println("The width of market is "+width);
double length = Market.getLength();
System.out.println("the length of market is "+length);
boolean customerInteraction = Market.getCustomerInteraction();
System.out.println("The customerInteraction towards market is "+customerInteraction);
}
}