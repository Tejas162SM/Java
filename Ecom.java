class Ecom{

String productName;
String productID;
int price;
String prdAvailableAt[] = {"Amazon","Flipkart","Ajio","Myntra"};

public Ecom(){
this("T-Shirt","T1234S",599);
System.out.println("Ecom Constructor created");
}

public Ecom(String productName,String productID,int price){
this.productName = productName;
this.productID = productID;
this.price = price;
}

public void displayProd(){
System.out.println(this.productName+" "+this.productID +" "+this.price);
}

public void availableAt(){
for(int i=0; i<this.prdAvailableAt.length; i++){
System.out.println(this.prdAvailableAt[i]);
}

}




}