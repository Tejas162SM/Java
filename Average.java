import java.util.Scanner;


class Average{

public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array of numbers");
int[] array = sc.next();
float avrage = getAverage(avg);
System.out.println(avg);

}

public static float getAverage(int[] array){
for(int i=0; i<= array ; i++){
float avg= (array+i)/array.length;
return avg;
}

}

}



