class MechUtil{

public static void main(String a[]){

Engineer mech = new Engineer();

mech.branch = "Mechnaical ";
mech.college = "KIT, Tiptur";
mech.place = "Hassan Circle Tiptur";
mech.university = "VTU";

String Mech = mech.problemSolving();
System.out.println(Mech);

mech.displayDetails();

}

}