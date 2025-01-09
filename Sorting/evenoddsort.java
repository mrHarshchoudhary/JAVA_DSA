package Sorting;
import java.util.Scanner;

public class evenoddsort {
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    } 
    static void printarray(int[]arr){
        for(int a:arr){
            System.out.print(a +" ");
        }
    }
    static void sorting(int []arr){
        int even=0;//left pointer
        int odd=arr.length-1;//right pointer
        while(even<odd){
        
        if(arr[even]%2==1&&arr[odd]%2==0){
            swap(arr, even, odd);
            even++;
            odd--;
        }
        if(arr[even]%2==0){
            even++;
        }
        if(arr[odd]%2==1){
            odd--;
        }
    }
    
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array of size");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is");
        printarray(arr);
        sorting(arr);
        System.out.println("after sorting array");
        printarray(arr);
}


}
