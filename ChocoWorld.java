class ChocoWorld{

public static void main(String a[]){

Chocolates.getChochoDetails();

Chocolates ref = new Chocolates();
ref.chochoName = "kisme";
ref.price = 2;
System.out.println(ref.chochoName+ "\n"+ "Rs- "+ref.price+"\n");

Chocolates ref1 = new Chocolates();
ref1.chochoName = "KitKat";
ref1.price = 20;
System.out.println(ref1.chochoName+ "\n"+ "Rs- "+ref1.price+"\n");

Chocolates ref2 = new Chocolates();
ref2.chochoName = "MilkyBar";
ref2.price = 10;
System.out.println(ref2.chochoName+ "\n"+ "Rs- "+ref2.price+"\n");


}



}