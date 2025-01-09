package Sorting;
public class insertion {
    static void insertionsort(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&&a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[]args){
        int a[]={7,8,9,0,4};
        insertionsort(a);
        for(int i:a){
            System.out.print(i+ " ");
        }

    }
}
