package Sorting;
public class selection {
    static void selectionsort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
          int   min_index=i;
          for(int j= i+1;j<n;j++){
            if(a[j]<a[min_index]){
                min_index=j;
            }
          }
          int temp=a[i];
          a[i]=a[min_index];
          a[min_index]=temp;
        }
    }
    public static void main(String[]args){
        int a[]={5,3,2,1,4};
        selectionsort(a);
        for(int i:a){
            System.out.print(i +" ");
        }
    }
}
