package Sorting;
public class bubble {
    static void bubblesort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
                
            }
            if(flag==false){
                return ;
            }
        }
        //this code time complaxity is n in best case
    }
    public static void main(String args[]){
            int a[]={9,8,7,6,5};
            bubblesort(a);
            System.out.println("the sorted array is: ");
            for(int i:a){
                
                System.out.print(i+" ");
            }
    }
}
