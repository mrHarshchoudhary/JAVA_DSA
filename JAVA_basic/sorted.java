package JAVA_basic;
import java.util.Scanner;
public class sorted {
  
static boolean issorted(int arr[]){
    boolean c=true;
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
             c=false;
            break;
        }
        
    }
    return c;
}
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the array of size");
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
System.out.println("the array is:");
for(int a:arr){
    System.out.print(a +" ");

}
System.out.println("the arry is  sorted "+ issorted(arr));

    }
}
