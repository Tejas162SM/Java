class SweetsWorld{

public static void main(String a[]){

Sweets ref = new Sweets();
ref.shopName = "NKN Beakery and Sweets";
ref.sweetName = "Dhood Peda";
ref.price = 70;
System.out.println(ref.shopName+"\n"+ ref.sweetName +"\n"+ "Rs- "+ref.price+"\n" );

Sweets ref1 = new Sweets();
ref1.shopName = "Siddalingeshwara Beakery and Sweets";
ref1.sweetName = "Jalebi";
ref1.price = 40;
System.out.println(ref1.shopName+"\n"+ ref1.sweetName +"\n"+ "Rs- "+ref1.price+"\n");

Sweets ref2 = new Sweets();
ref2.shopName = "Dhanalakshmi Beakery and Sweets";
ref2.sweetName = "Dharwad Peda";
ref2.price = 80;
System.out.println(ref2.shopName+"\n"+ ref2.sweetName +"\n"+ "Rs- "+ref2.price+"\n");

}

}