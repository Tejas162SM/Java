class ElectionUtil{

static String[] documents={"Adhaar Card", "Ration Card", "Bonafied Certificate"};
public static void main(String a[]){
System.out.println("Main method started");

Election.allow(documents);
System.out.println("Main method ended");
}

}