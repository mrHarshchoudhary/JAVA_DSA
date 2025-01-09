package Stack;
import java.util.Scanner;
public class prefixsum {
    static void printarray(int []arr){
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
    static int[]presum(int []arr){
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        } 
        return pref;
    }
    public static void main(String []args){
        System.out.println("enter the array size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the original array is");
        printarray(arr);
         int [] pref=presum(arr);
            System.out.println("prefix sum of array is");
            printarray(pref);
    }
}
