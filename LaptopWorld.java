class LaptopWorld{

public static void main(String a[]){

Laptop ref = new Laptop();
ref.laptopBrand = "ASUS";
ref.laptopName = "ASUS VivoBook";
ref.ram = 8;
ref.price = 54000L;
System.out.println(ref.laptopBrand+"\n"+ ref.laptopName +"\n" +"RAM- " +ref.ram +"\n"+"Rs- "+ ref.price+"\n");

Laptop ref1 = new Laptop();
ref1.laptopBrand = "DELL";
ref1.laptopName = "Inspiron";
ref1.ram = 12;
ref1.price = 72000l;
System.out.println(ref1.laptopBrand+"\n"+ ref1.laptopName+"\n"+"RAM- "+ref1.ram+"\n"+"Rs- "+ref1.price);

}




}