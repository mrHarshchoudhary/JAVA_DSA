package Stack;
import java.util.*;
public class movestackinsameorder {
    public static void main(String[] args) {
       Stack<Integer>st=new Stack<>(); 
       Scanner sc=new Scanner(System.in);
    //    int n;
    //    System.out.println("enter the number of elmenet you want to insert");
    //    n=sc.nextInt();
    //    System.out.println("enter the elmenet");
    //     for(int i=0;i<n;i++){
            
    //         int x=sc.nextInt();
    //         st.push(x);
    //     }
    //     System.out.println(st);
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    Stack<Integer>rt=new Stack<>();
    while(st.size()>0){
    //     int x=st.peek();
    //     rt.push(x);
    //     st.pop();
    rt.push(st.pop());
     }
  
    System.out.println(rt);
    Stack<Integer>gt=new Stack<>();
    while(rt.size()>0){
        gt.push(rt.pop());
    }
    System.out.println(gt);
    }
}
