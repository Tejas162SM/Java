class Speaker{

static String name = "BoAt";
static int minVolume = 0;
static int maxVolume = 15;
static boolean isConnected = false;
static int currentVolume;

public static boolean onOrOff(){
if(isConnected== false){
isConnected = true;
System.out.println("Speaker is turned on");
return isConnected;
}
else if(isConnected== true){
  isConnected = false;
System.out.println("Speaker is turned off");
  return isConnected;
}
return false;
}


public static void increaseVolume(){
System.out.println("inside increase volume method");
if(isConnected){
   if(currentVolume < maxVolume){
   currentVolume= currentVolume+1;
System.out.println("the current volume is :" + currentVolume);
}
else{
System.out.println("Max volume reached");
}

}
else{
System.out.println("Please turn on the speaker");
}
System.out.println("end of increase volume method");
}


public static void decreseVolume(){
System.out.println("inside decrease volume method");
if(isConnected){
   if(currentVolume > minVolume){
   currentVolume= currentVolume-1;
System.out.println("the current volume is :" + currentVolume);
}
else{
System.out.println("Min volume reached");
}
else{
System.out.println("Please turn on the speaker");
}
}


System.out.println("end of decrease volume method");


}
}