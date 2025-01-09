package Hashmap.hashmap;
import java.util.*;
public class basichashmap {
    public static void main(String[] args) {
      Map<Integer,String>mp=new HashMap<>();
      mp.put(3,"Aman");
      mp.put(4, "harsh");
      mp.put(5, "vignesh");
      mp.put(3, "herry");//if we put duplicate value then it override prev value 
     //mp.putIfAbsent(3, "kajal");  //if  dont wnat to override value then

      // System.out.println(mp.entrySet()); 
      // //return onlu key
      // System.out.println(mp.keySet());
      // System.out.println(mp.values());
    
      // System.out.println(mp.get(3));
      // //conains is key is exists true or false
      // System.out.println(mp.containsKey(4));
      // //containvalue name se 
      // System.out.println(mp.containsValue("harsh"));

      //iterations accoring key in a map
      for(Integer i:mp.keySet()){
        System.out.println(i);
      }
      for(String i:mp.values()){//var also be write here java 10 allow it
        System.out.println(i);
      }
      //iterate over key value mapping
      for(var e:mp.entrySet()){
        System.out.println(e.getKey());
      }


    }
}
