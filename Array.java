import java.util.Scanner;

class Array{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array ");
int n;
n = sc.nextInt();

int a[] = new int[n];
System.out.println("Enter array elements :");
int i;
for(i=0; i<n; i++){
a[i]= sc.nextInt();
System.out.println(a[i]);
}

}


}