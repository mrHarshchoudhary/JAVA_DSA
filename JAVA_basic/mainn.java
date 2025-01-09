package JAVA_basic;
 import java.util.Scanner;
 class array {
    /*void multi(){
        int[][] arr=new int[5][3];

    }
    void demo(){
        int[] ages=new int[3];
        ages[0]=1;
        ages[1]=23;
        ages[2]=10;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println("using loop printing\n");
        for(int i=0;i<=2;i++){
            System.out.println(ages[i]);
        }
        for(int a:ages){
            System.out.println(a);
        }
    }

}*/


public class mainn{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int []arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         for(int a:arr){
            System.out.println(a);
         }
    }
}
