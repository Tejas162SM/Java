class MusicInstutil{
public static void main(String a[]){

MusicalInstruments music = new MusicalInstruments();

music.name = "Guitar";
music.price = 4999.0;
music.frequency = "30Hz";
music.type = "Westren";
System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);
music.play(music.name);

}


}