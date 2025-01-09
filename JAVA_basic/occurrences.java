package JAVA_basic;
import java.util.Scanner;

public class occurrences {
  static   int demo(int []arr,int x){
            int lastindex=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                 lastindex=i;
                }
                
            }
            return lastindex;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array of size\n");
        int n=sc.nextInt(); 
        int []arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         int x;
         System.out.println("enter the number which you find");
         x=sc.nextInt();
         for(int a:arr){
            System.out.print (a +" ");
         }
         System.out.println("last index  x is:" + demo(arr,x));
    }
}
