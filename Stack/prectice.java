package Stack;
public class prectice {
     public static void  main(String args[]){
       String str="Parul univErsity";
      String lower = str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=lower.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
      System.out.println("the vowels is"+count);
    

    }
    }  

