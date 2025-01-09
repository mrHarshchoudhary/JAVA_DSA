package JAVA_basic;
public class reverse {
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reversearray(int []arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j); 
            i++;
            j--;
        }
    }
    static void printarray(int[]arr){
        for(int a:arr){
            System.out.print(a +" ");
        }
    }
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        reversearray(arr);
        printarray(arr);

    }
}
