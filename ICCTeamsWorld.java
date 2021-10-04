class ICCTeamsWorld{


public static void main(String a[]){

ICCTeams.getTeams();

ICCTeams ref = new ICCTeams();
ref.teamName = "India";
ref.jursyColor = "Blue";
System.out.println(ref.teamName +"\n"+ref.jursyColor+"\n");

ICCTeams ref1 = new ICCTeams();
ref1.teamName = "Austrelia";
ref1.jursyColor = "Yellow";
System.out.println(ref1.teamName +"\n"+ref1.jursyColor+"\n");

ICCTeams ref2 = new ICCTeams();
ref2.teamName = "South Africa";
ref2.jursyColor = "Ligh Blue";
System.out.println(ref2.teamName +"\n"+ref2.jursyColor+"\n");

ICCTeams ref3 = new ICCTeams();
ref3.teamName = "Pakistan";
ref3.jursyColor = "Green";
System.out.println(ref3.teamName +"\n"+ref3.jursyColor+"\n");




}
}