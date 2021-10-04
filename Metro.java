class Metro{

String stationName;
int noOfStations;
boolean isOpen;
String route[] = {"Majestic", "Mantri Square","Srirampura", "MK Road", "Rajajinagar","Mahalakshmi","Sandal Soap Fact","Yeshwanthpur","goraguntepalya","Peenya","Peenya industry","jalahalli","Dasarahalli","nagasandra"};

public Metro(){
this("Majestic", 14, true);
System.out.println("Metro Constructor is Created");

}

public Metro(String stationName,int noOfStations,boolean isOpen){
this.stationName = stationName;
this.noOfStations = noOfStations;
this.isOpen = isOpen;

}

public void displayMetro(){
System.out.println(this.stationName+" "+ this.noOfStations +" "+this.isOpen );

}
public void getStations(){
for(int i=0; i<this.route.length; i++){
System.out.println(this.route[i]);
}
}


}