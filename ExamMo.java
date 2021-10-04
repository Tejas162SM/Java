class Exam{

public static String universityName= "VTU";

public static int fees=1001;

public static void allow(String[] hallTicket){ 
System.out.println("Inside allow method with hallticket"); 
if(hallTicket != null){ 
getHallTicketDetails(hallTicket);
}
else{
System.out.println("hallTicket not found");
}



System.out.println("end of allow method with hallticket");
}
public static void allow(int fees) {

System.out.println("Inside allow method with fee");

if(fees>1000){

System.out.println(fees);
}
else{

System.out.println("please pay the fees"); 


}
System.out.println("end of allow method with fee");

public static void getHallTicketDetails (String[] hallTicket){ 
for(int i=0; i < hallTicket.length; i++){ 
System.out.println(hallTicket[i]);

}
}
