package Stack;
import java.util.Scanner;
public class presuffsum {
    static void printarray(int []arr){
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
    static int totelsum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    static boolean equalsum(int []arr){
        int sum=totelsum(arr); 
        int presum=0;
        for(int i=0;i<arr.length;i++){
            presum=presum+arr[i];
            int sufsum=sum-presum;
            if(presum==sufsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is");
        printarray(arr);
        System.out.println("the sum is queal or not " +equalsum(arr));
    }
}
