package String;
public class palindromsubstring {
    public static boolean ispalidrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))  return false;
            i++;
            j--;
        };
        return true;

    }
    public static void main(String[]args){
        String s="abbd";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(ispalidrom(s.substring(i, j))==true){
                    count ++;
                }
              
                
            }
        }

         System.out.println(count);
    }
}
