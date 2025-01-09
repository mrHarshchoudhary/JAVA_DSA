package Stack;
import java.util.Stack;

public class posttoinfix {
     public static void main(String[] args) {
        Stack<String>val=new Stack<>();
        String str="953+4*6/-";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48&&ascii<=57){
                val.push(ch+"");
            }
            else{
                String v2=val.pop();
                String v1=val.pop();
               char op=ch;
               //v1 op v2
               String t= "(" + v1 + op +v2 + ")";
               val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
