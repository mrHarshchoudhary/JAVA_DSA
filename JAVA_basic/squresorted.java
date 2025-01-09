package JAVA_basic;
import java.util.Scanner;
public class squresorted {
    static int[] squreofvalue(int []arr){

        int n=arr.length;
        int []ans=new int[n];
        int left=0;
        int right=n-1;
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    
     static void printarray(int []arr){
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size");
int n =sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

}
System.out.println("the array is");
printarray(arr); 
int []ans=squreofvalue(arr);
System.out.println("after sorted in squremanner");
squreofvalue(arr);
printarray(ans);

    }
}
