class AmazonPrime{

static String[] movies = {"Kottigobba 3", "Ranna",  "Manikya", "Vikrant Rina", "Nalla", "Mussanje Mathu", "Thirtha" };
static String[] series = {"F.R.I.E.N.D.S", "Money Heist", "Lucifer" ," Jumanji"};
static String movie = "KGF";

public static void main(String a[]){
System.out.println("Main method started");
getMovies(movies);
getSeries(series);
String mov = getMovies(movie);
System.out.println(mov);

}

public static void getMovies(String[] movies){
System.out.println("inside getMovies method of string array");
for(int i = 0; i< movies.length; i++){
System.out.println(movies[i]);
}
}
public static String getMovies(String movie){
System.out.println("inside getMovies method of Single string");
return movie;
}
public static void getSeries(String[] series){
System.out.println("inside getSeries method of string array");
for(int i = 0; i< series.length; i++){
System.out.println(series[i]);
}
}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                