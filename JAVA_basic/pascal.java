package JAVA_basic;
import java.util.*;
public class pascal {
    static void printmatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
    static int[][] pascal(int n){
        int [][] ans=new int[n][];//har row me alag alag coloumn he jo jm niche deside krege
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];//space print ke liye row se 1 jyada columns
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
return ans;
    }
    public static void main(String[]args){
            Scanner sc=new Scanner (System.in);
            System.out.println("enter n");
            int n=sc.nextInt();
            int[][]ans=pascal(n);
            printmatrix(ans);
    }
}
