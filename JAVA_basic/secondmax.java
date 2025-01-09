package JAVA_basic;
import java.util.Scanner;
public class secondmax {
 static int  findmax(int []arr){
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>mx){
            mx=arr[i];
        }
    }                                                          
    return mx;
}
static int findsecondmax(int[]arr){
    int mx=findmax(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i]==mx){
            arr[i]= Integer.MIN_VALUE;
        }
    }
    int secondmax=findmax(arr);
    return secondmax;
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
        System.out.println("the second maximum element is :" +findsecondmax(arr));
}
}
