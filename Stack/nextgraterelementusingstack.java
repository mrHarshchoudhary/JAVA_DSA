package Stack;
import java.util.Stack;

public class nextgraterelementusingstack {
    public static int [] nextgreater(int []arr){
         int n=arr.length;
        Stack<Integer>st= new Stack<>();
        // int x=arr[n-1];
        // st.push(x);
        int []res=new int[n];
        for(int i=n-1;i>=0;i--){//you can also n-1 but remove x
            while(st.size()>0&&st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
}
        else  res[i]=st.peek();
            st.push(arr[i]);
            
            // int m=res.length;
            // for(int j=m-1;j>=0;j--){
            //     res[j]=st.pop();
            // }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,5,3,2,1,6,3,4};
        int []res=nextgreater(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
