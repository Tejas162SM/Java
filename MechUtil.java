class MechUtil{


public static void main(String a[]){

Engineer mech = new Engineer();
mech.branch = "Mechanical Engineering";
mech.college = "Kalpataru Institute of Technology";
mech.place = "Mayasandra";
mech.university = "Mallayaaya university";

String Mech = mech.problemSolving();
System.out.println(mech);
mech.displayDetails();


}


}