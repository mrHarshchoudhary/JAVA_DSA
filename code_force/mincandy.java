package code_force;
import java.util.*;
public class mincandy {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int total=0;
    System.out.println("enter the value");
    int n=sc.nextInt();

    int []arr=new int[n];
    int []candy=new int[n];
    System.out.println("enter the arr");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      candy[i]=1;
    }
    // L to R
    for(int i=1;i<n;i++){
      if(arr[i]>arr[i-1]){
        candy[i]=candy[i-1]+1;
      }
    }
    for(int j=n-2;j>=0;j--){
      if(arr[j]>arr[j+1]){
        candy[j]=Math.max(candy[j],candy[j+1]+1);
      }
    }
    for(int i=0;i<n;i++){
      total=total+candy[i];
    }
    System.out.println("total candy distibuted is: " + total);

  }
}
