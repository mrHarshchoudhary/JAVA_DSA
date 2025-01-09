package JAVA_basic;
import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       int sum=0;
       
        while(n>0){
           sum=(sum*10+n%10);
           n=n/10;
        }
        System.out.println("the number sum is:" +sum);

    }
    }

