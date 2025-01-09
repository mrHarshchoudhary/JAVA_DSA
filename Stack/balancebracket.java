package Stack;
import java.util.*;
public class balancebracket {
    public static boolean isbalance(String str){
        Stack<Character>st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0)return false;
                else if(st.peek()=='(')st.pop();
            }
        }
        if(st.size()>0)return false;
        else{
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //  System.out.println(str);
        System.out.println(isbalance(str));

    }
}
