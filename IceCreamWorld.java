class IceCreamWorld{

public static void main(String a[]){

IceCreams.getIceCream();

IceCreams ref = new IceCreams();
ref.iceName = "Venilla with Pista";
ref.price = 30;
System.out.println(ref.iceName+ "\n"+ "Rs- "+ref.price+"\n");

IceCreams ref1 = new IceCreams();
ref1.iceName = "Tender Coconut ice Cream";
ref1.price = 20;
System.out.println(ref1.iceName+ "\n"+ "Rs- "+ref1.price+"\n");

IceCreams ref2 = new IceCreams();
ref2.iceName = "Mango IceCream";
ref2.price = 40;
System.out.println(ref2.iceName+ "\n"+ "Rs- "+ref2.price+"\n");


}



}