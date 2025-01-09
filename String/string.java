package String;
import java.util.*;
public class string {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //String str="harsh";
        //System.out.println(str);
       // String s=sc.nextLine();
        //System.out.println(s);
      //  System.out.println(str.charAt(5));
        //System.out.println(str.indexOf('z'));
       // String gtr="Zelho";
        //System.out.println(str.compareTo(gtr));
       // String str="harsh choudhary";
        //System.out.println(str.contains("arsh"));
       /*  String str="abc";
        str+="xyz";
        str+=10;
        System.out.println(str);
        System.out.println("avc"+10+20);

String str="abcdef";
System.out.println(str.substring(0,5 ));
System.out.println(str.substring(2));
str=str.substring(0, 2)+"y"+str.substring(3);
System.out.println(str);
*/
StringBuilder str=new StringBuilder("vandana mewada");
//str.setCharAt(0, 'm');
//System.out.println(str);
str.insert(2,'y');
System.out.println(str);
str.deleteCharAt(0);
System.out.println(str);
str.reverse();
System.out.println(str);
str.delete(0, 3);
str.reverse();
System.out.println(str);


    }
}
