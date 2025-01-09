package Stack;
import java.util.*;
public class statckbasic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //peek;
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println("size is"+st.size());
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
