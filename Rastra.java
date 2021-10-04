class Rastra{
static String[] countryName =  {"India", "England", "Nepal", "Australia"};
 

public static void main(String a[]){


getCountryName();


}
   public static void getCountryName(){
     System.out.println(countryName.length);

      for(int i=0; i<countryName.length ; i++){

       System.out.println(countryName[i]+" ");

     }
   
}