package JAVA_basic;
import java.util.Scanner;
public class pattern {
    public static void main(String[]args){
        Scanner sc=new  Scanner(System.in);
        int r=sc.nextInt();
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if((i+j)%2==0)
                System.out.print(1);
                else
                System.out.print(2);
            }
                
            
            System.out.println();
        }
    }
}
