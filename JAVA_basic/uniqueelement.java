package JAVA_basic;
import java.util.Scanner;
public class uniqueelement {
    static int unique(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int k=0;k<arr.length;k++){
            if(arr[k]!=-1){
                ans=arr[k];
            }
        }
        return ans;
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
        System.out.println("the unique element is :" +unique(arr));
}
}
