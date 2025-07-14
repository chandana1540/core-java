class WalkiTalki{
static int signalStrength;
static boolean scanonOrOff;
static String channelID;
static char powerLevel;
static float distance;

public static int getSignalStrength(){
signalStrength = 70;
return signalStrength;
}
public static boolean getScanOnOrOff(){
scanonOrOff = true;
return scanonOrOff;
}
public static String getChannelID(){
channelID = "channel A";
return channelID;
}
public static char getPowerLevel(){
powerLevel = 'L';
return powerLevel;
}
public static float getDistance(){
distance = 3.40f;
return distance;
}
}