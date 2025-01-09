package JAVA_basic;
import java.util.Scanner;
public class targetsum {
    static int  target(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==x){
                    count++;
                }
                }
            }
        }
return count;

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
        System.out.println("enter the number");
        int x=sc.nextInt();
        System.out.println("the number of "+target(arr,x));
}
    }