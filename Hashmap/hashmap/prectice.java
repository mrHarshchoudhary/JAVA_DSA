package Hashmap.hashmap;
import java.util.*;
public class prectice {
  public static void main(String[] args) {
    Map<String,Integer>mp=new HashMap<>();
    mp.put("Aakash", 21);
    mp.put("Yash", 16);
    mp.put("Lav", 19);
    mp.put("Rishika", 19);
    mp.put("Harry", 18);
    System.out.println(mp.get("Yash"));//if not in list then print null
    mp.put("Aakash", 25);//override aakash value
    //remove pair
   System.out.println(mp.remove("Aakash")); //25 value print krega if aakash not exsits hen print null
   //chechking if key exist or nt
   System.out.println(mp.containsKey("Yash"));
   System.out.println(mp.containsKey("Aakash"));
   //aading new entry only if the new key does not exists
   mp.putIfAbsent("Yash", 30);//no enter because yash already exists 
   //get all key in hashmap
   System.out.println(mp.keySet());
   //all value
   //mp.values();
   //all enteryset
   //mp.entrySet()
//travasing all enrtis of hashmap
for(String key:mp.keySet()){
  System.out.printf("Age of %s is %d\n" ,key,mp.get(key));
}
    for
  }
}
