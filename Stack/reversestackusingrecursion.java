package Stack;
import java.util.Stack;

public class reversestackusingrecursion {
    public static void pushatbottom(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);  //1
            return ;//2
        }
            int top=st.pop();
            pushatbottom(st, x);
            st.push(top);//3
    }
    public static void reverse(Stack<Integer>st){
        if(st.size()==1)return ;
        int top=st.pop();
        reverse(st);
        pushatbottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
