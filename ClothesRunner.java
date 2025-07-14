class ClothesRunner {
public static void main(String cloth[]){
String brand = Clothes.getBrand();
System.out.println("The brand of the clothes is "+brand);
int price = Clothes.getPrice();
System.out.println("The Price of the clothes is "+price);
char size = Clothes.getSize();
System.out.println("The size of Clothes is "+size);
boolean itemStock = Clothes.getItemStock();
System.out.println("The itemStock of clothes is "+itemStock);
float length = Clothes.getLength();
System.out.println("The length of clothes is "+length);
}
}