package Stack;
import java.util.Stack;

public class infixtoprefix {
        public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String>val=new Stack<>();
        Stack<Character>op=new Stack<>();
for(int i=0;i<infix.length();i++){
    char ch=infix.charAt(i);//ch='5'
    int ascii=(int)ch;//ascii=53
    //'0'->48   '9'->57
    if(ascii>=48&&ascii<=57){
        String s=""+  ch;//string bnaya
        val.push(s);
    }
    else if(op.size()==0||ch=='('||op.peek()=='('){
        op.push(ch);
    }
    else if(ch==')'){
        while(op.peek()!='('){
            String v2=val.pop();
            String v1=val.pop();
           //
           char o= op.pop();
           String t=o + v1  + v2;
           val.push(t);
        }
        op.pop();//opening bracket hta diya
    }
    else{
        if(ch=='+'||ch=='-'){
            String v2=val.pop();
            String v1=val.pop();
           //
           char o= op.pop();
           String t=o + v1 + v2;
           val.push(t);
           op.push(ch);

        }
        if(ch=='*'||ch=='/'){
            if(op.peek()=='*'||op.peek()=='/'){
                //work
                String v2=val.pop();
            String v1=val.pop();
           //
           char o= op.pop();
           String t=o + v1 + v2;
           val.push(t);
               op.push(ch);
            }
            else{
                op.push(ch);
            }
        }
        
    }
   }
   while(val.size()>1){
    String v2=val.pop();
            String v1=val.pop();
           //
           char o= op.pop();
           String t=o + v1 +    v2;
           val.push(t);
   }
   String prefix=val.pop();
   System.out.println(prefix);

        }
    }


