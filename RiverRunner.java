class RiverRunner {
public static void main(String river[]){

String riverName = River.getRiverName();
System.out.println("The Name of the River is "+riverName);

float discharge = River.getDischarge();
System.out.println("The discharge of these river is "+discharge);

int noOftributaries = River.getNoOfTributaries();
System.out.println("The no of Tributaries in river are "+noOftributaries);

boolean isNavigable = River.getIsNavigable();
System.out.println("The River isNavigable "+isNavigable);

byte length = River.getLength();
System.out.println("The length of River is "+length);
}
}
