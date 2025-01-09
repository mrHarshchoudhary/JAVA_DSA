package JAVA_basic;
import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array of size\n");
        int n=sc.nextInt(); 
        int []arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         for(int a:arr){
            System.out.print (a +" ");
         }
    }
}

