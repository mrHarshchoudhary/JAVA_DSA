package String;
public class reverseeachword {
    public static void main(String []args){
        String str="I am educator";
        String ans=" ";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans=ans+sb;
                ans+=" ";
                sb=new StringBuilder("");
            }
    }
    //  sb.append(" ");
    sb.reverse();
    ans+=sb;
    //sb.reverse();
    System.out.println(ans);
}
}
