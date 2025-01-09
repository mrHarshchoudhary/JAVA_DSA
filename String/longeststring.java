package String;

public class longeststring {
    public static void main(String[] args) {
        String str="Parul university Vadodara Gujarat Choose more Choose right Be here Be vibrant";
        String word="";
        String lg="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                word+=ch;
            }
            else{
                if(word.length()>lg.length()){
                    lg=word;
                    
                }
                word="";
            }
                
         
    }
    // if(word.length()>lg.length()){
    //     lg=word;
    // }
    System.out.println("the longest word is "+lg);
}
}
