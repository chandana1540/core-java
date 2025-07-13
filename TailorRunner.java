class TailorRunner {
public static void main(String tailor[]){

int tailorId = Tailor.getTailorId();
System.out.println("The tailorId is "+tailorId);

float price = Tailor.getPrice();
System.out.println("The Price of Tailor is "+price);

boolean isActive = Tailor.getIsActive();
System.out.println("The tailor isActive "+isActive);

double length = Tailor.getLength();
System.out.println("length "+length);

String tailorName = Tailor.gettailorName();
System.out.println("The Name of a tailor is "+tailorName);

}
}