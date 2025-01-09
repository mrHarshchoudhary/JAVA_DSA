package Stack;
import java.util.Stack;

public class postfixevaluations {
    public static void main(String[] args) {
        Stack<Integer>val=new Stack<>();
        String str="953+4*6/-";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v2=val.pop();
                int v1=val.pop();
                if(ch=='+')val.push(v1+v2);
                if(ch=='-')val.push(v1-v2);
                if(ch=='*')val.push(v1*v2);
                if(ch=='/')val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
