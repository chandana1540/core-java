class GamingPC{
static String type;
static float price;
static byte frameRate;
static boolean tracingSupport;
static double speed;

public static String getType(){
type = "Air cooling";
return type;
}

public static float getPrice(){
price = 2500.00f;
return price;
}

public static byte getFrameRate(){
frameRate = 126;
return frameRate;
}

public static boolean getTracingSupport(){
tracingSupport = true;
return tracingSupport;
}

public static double getSpeed(){
speed = 150.75;
return speed;
}
}