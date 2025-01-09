package JAVA_basic;
import java.util.Scanner;
public class rotatearray {
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    } 
    static void reversearray(int []arr,int i,int j){
        while(i<j){
            swap(arr,i,j); 
            i++;
            j--;
        }
    }
    static void printarray(int[]arr){
        for(int a:arr){
            System.out.print(a +" ");
        }
    }
    static  void  rotate(int []arr,int k){
        int n=arr.length;
        k=k%n;
        reversearray(arr,0,n-k-1);
        reversearray(arr,n-k,n-1);
        reversearray(arr,0,n-1);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5};
        System.out.println("enter the number");
        int k=sc.nextInt();
        rotate(arr,k);
        printarray(arr);
    }
}
