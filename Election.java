class Election{

public static String Place = "Tarikere";
public static int age = 19;

public static void allow(String[] documents){
System.out.println("inside allow method");

if(age> 18){
  System.out.println("Congrats you are Eligible for voting");

   if(null!=documents){
         System.out.println("Documnets found");
         getCandidateDocuments(documents);

      }
   else{
         System.out.println("No Documents found please submit them ASAP");

}

}

else{
 System.out.println("Please wait untill the age of 18...");

}
System.out.println("end of allow method");
}

public static void getCandidateDocuments(String[] documents){
  for(int i=0; i<documents.length; i++){
    System.out.println(documents[i]);
}
}

}