package JAVA_basic;
import java.util.Scanner;
public class GCD {
    static int gcd(int x,int y){
        if(y==0)
        return x;
        return gcd(y,x%y);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=gcd(x, y);
        System.out.println("the gretest common divisor is " + a);
    }
}
