package JAVA_basic;
import java.util.*;
public class prism {
    // public static void prismgraph(int [][]arr,int m,int n,int v1,int v2){
       
    // }
    // public  static void minimum(int [][]arr,int m,int n){
    //     int min=arr[0][0];
    //     for(int i=0;i<=m;i++){
    //         for(int j=0;j<=n;j++){
    //             if(arr[i][j]<min){
    //                 min=arr[i][j];
    //                 int v1=i;
    //                 int v2=j;

    //             }
    //         }
    //     }

    // }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int m=sc.nextInt();
        System.out.println("enter the coloumn");
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           System.out.println(arr[i][j]+" ");

        }
        System.out.println();
}
//minimum(arr, m, n);
    }
}

