import java.util.Scanner;

class OddEven{
public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number :");
int number = sc.nextInt();

oddNum(number);
}

public static void oddNum(int number){
if(number %2 ==0){
System.out.println("The number is Even");
}
else{
System.out.println("The number is Odd");
}
}

}