class MakeUpKitRunner {
public static void main (String makeupkit[]){

String dataType = MakeUpKit.getDataType();
System.out.println("The datatype of makeupkit is "+dataType);

double price = MakeUpKit.getPrice();
System.out.println("The price of this makeupkit is "+price);

boolean isCruetlyFree = MakeUpKit.getIsCruetlyFree();
System.out.println("The makeupkit of isCruetlyFree is "+isCruetlyFree);

int quantity = MakeUpKit.getQuantity();
System.out.println("The Quantity of these makeupkit is "+quantity );

short size = MakeUpKit.getSize();
System.out.println("The size of makeupkit is "+size);
}
}