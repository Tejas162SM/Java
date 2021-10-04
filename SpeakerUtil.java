class SpeakerUtil{

public static void main(String a[]){
boolean isConnected = Speaker.onOrOff();

System.out.println("The speaker isConnected"+ isConnected);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();

boolean Connected = Speaker.onOrOff();

System.out.println("The speaker isConnected"+ isConnected);
Speaker.decreseVolume();
Speaker.decreseVolume();
Speaker.decreseVolume();
Speaker.decreseVolume();
Speaker.decreseVolume();
Speaker.decreseVolume();
}
}