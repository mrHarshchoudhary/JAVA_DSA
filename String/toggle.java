package String;
public class toggle {
    public static void main(String[]args){
        String str="PhYscIs h8rsH";
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ch==' ' ||ch>=0)continue;
            boolean flag=true;
            if(ascii>=97) flag=false;
            if(flag==true){
                ascii+=32;
                char dh=(char)ascii;
                str=str.substring(0, i)+dh+str.substring(i+1);
                //in stringbuilder we can use setcharAt(i) function 

            }
            else{
                ascii-=32;
                char dh=(char)ascii;
                str=str.substring(0, i)+dh+str.substring(i+1);

            }
        }
        System.out.println(str);
    }
}
