class Airport{

static String[] internationalAirports={"Kempegowda International Airport","Mangalore International Airport"};
static String[] domesticAirports={"Belgaum Airport","Bellary Airport","Mysore Airport","Huballi Airport"};

public static void main(String a[]){

getInternationalAirports();
getDomesticAirports();
}

public static String[] getInternationalAirports(){

for(int i=0;i<internationalAirports.length;i++){
System.out.println(internationalAirports[i]);
}
return internationalAirports;
}


public static String[] getDomesticAirports(){

for(int j=0;j<domesticAirports.length;j++){
System.out.println(domesticAirports[j]);
}
return domesticAirports;
}
}