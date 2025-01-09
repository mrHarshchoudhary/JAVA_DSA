package JAVA_basic;
import java.util.Scanner;

public class sortingzeros {
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
        int left=0;
        int right=arr.length-1;
        while(left<right){
        
        if(arr[left]==1&&arr[right]==0){
            swap(arr, left, right);
            left++;
            right--;
        }
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
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
