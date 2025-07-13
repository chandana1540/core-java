class WalkiTalkiRunner {
public static void main(String walkitalki[]){

int signalStrength = WalkiTalki.getSignalStrength();
System.out.println("The signal strength of walkitalki is "+signalStrength);

boolean scanonOrOff = WalkiTalki.getScanOnOrOff();
System.out.println("The walkitalki of scanonOrOff is "+scanonOrOff);

String channelID = WalkiTalki.getChannelID();
System.out.println("The channelID of walkitalki is "+channelID);

char powerLevel = WalkiTalki.getPowerLevel();
System.out.println("The powerlevel of walkitalki is "+powerLevel);

float distance = WalkiTalki.getDistance();
System.out.println("The Distance of walkitalki is "+distance);

}
}