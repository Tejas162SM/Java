class EceUtil{

public static void main(String a[]){

Engineer ece = new Engineer();

ece.branch = "Electronics and communication ";
ece.college = "KIT, Tiptur";
ece.place = "Hassan Circle Tiptur";
ece.university = "VTU";

String Ece = ece.problemSolving();
System.out.println(Ece);

ece.displayDetails();

}

}