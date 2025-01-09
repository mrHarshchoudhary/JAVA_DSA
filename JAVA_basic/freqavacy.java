package JAVA_basic;
import java.util.Scanner;
public class freqavacy {
    static int[] freqavacyarray(int []arr){
        int []freq=new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    
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
        int []freq=freqavacyarray(arr);
        System.out.println("enter the number of quries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter the nunber to be search");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
                    q--;
        }
    }
}
