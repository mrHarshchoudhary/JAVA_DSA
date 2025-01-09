package Sorting;
public class merge {
    static void display(int a[]){
        for(int i:a){
            System.out.print(i + " ");
        }
    }
    static void mergeing(int a[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int []left=new int[n1];
        int []right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=a[l+i];
        }
        for(j=0;j<n2;j++)right[j]=a[mid+1+j];
        i=0;j=0;k=l;
        while (i<n1&&j<n2) {
            if(left[i]<right[j]){
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];
            }
            
        }
        while(i<n1){
            a[k++]=left[i++];
        }
        while(j<n2){
            a[k++]=right[j++];
        }
    }

    static void mergesort(int a[],int l,int r){
        if(l>=r)return;
        int mid=(l+r)/2;
        mergesort(a,l,mid);
        mergesort(a, mid+1,r);
        mergeing(a,l,mid,r);

    }
    public static void main(String[]args){
        
        int a[]={6,4,3,21,1};
        int n=a.length;
display(a);
mergesort(a,0, n-1);
System.out.println("after sorting array");
display(a);;
    }
}
