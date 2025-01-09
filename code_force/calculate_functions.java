// For a positive integer n let's define a function f:

// f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn

// Your task is to calculate f(n) for a given integer n.

// Input
// The single line contains the positive integer n (1 ≤ n ≤ 1015).

// Output
// Print f(n) in a single line.
package code_force;

import java.util.Scanner;

public class calculate_functions {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int sum=0;
    for(int i=1;i<=N;i++){
      if(i%2==0){
        System.out.print(-i);
      }
      else{
        System.out.print(i);
      }
    
    if(i<N){
      if(i%2==0){
       System.out.print("+");
      }
      else{
        System.out.print("");
      }
    }
    sum=sum+i;
    }
    System.out.println();
    System.out.println("the sum is:" +sum);
  }
}
