import java.util.Scanner;
class DecToBin{


public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num= sc.nextInt();
getnum(num);
}

public static void getnum(int num){
int bin[] = new int[32];
int index = 0;
while(num >0){
bin[index++] = num%2;
num = num/2;


}
for(int i =index-1; i>=0; i--){

System.out.print(bin[i]);
}


}







}