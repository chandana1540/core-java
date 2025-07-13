class River{
static String riverName;
static float discharge;
static int noOfTributaries;
static boolean isNavigable;
static byte length;

public static String getRiverName(){
riverName = "chandragiri";
return riverName;
}

public static float getDischarge(){
discharge = 1500.5f;
return discharge;
}

public static int getNoOfTributaries(){
noOfTributaries = 12;
return noOfTributaries;
}

public static boolean getIsNavigable(){
isNavigable = true;
return isNavigable;
}

public static byte getLength(){
length = 24;
return length;
}
}