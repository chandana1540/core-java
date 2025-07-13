class GamingPCRunner {
public static void main(String pc[]){

String type = GamingPC.getType();
System.out.println("The type of GamingPC is "+type);

float price = GamingPC.getPrice();
System.out.println("The Price of GamingPC is "+price);

byte frameRate = GamingPC.getFrameRate();
System.out.println("The frameRate of GamingPC is "+frameRate);

boolean tracingSupport = GamingPC.getTracingSupport();
System.out.println("The tracingSupport of GamingPC "+tracingSupport);

double speed = GamingPC.getSpeed();
System.out.println("The Speed of GamingPC is "+speed);
}
} 