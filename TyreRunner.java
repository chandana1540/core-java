class TyreRunner {
public static void main(String tyre[]){

int aspectRatio = Tyre.getAspectRatio();
System.out.println("The aspectRatio of tyre is "+aspectRatio);

char tyreType = Tyre.getTyreType();
System.out.println("The Type of Tyre is "+tyreType);

float width = Tyre.getWidth();
System.out.println("The Width of Tyre is "+width);

String tyreName = Tyre.getTyreName();
System.out.println("The Name of a Tyre is "+tyreName);

double diameter  = Tyre.getDiameter();
System.out.println("The Diameter of Tyre is "+diameter);
}
}
