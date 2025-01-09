package Hashmap.hashmap;
import java.util.*;
import java.util.HashMap;

public class frequetyofelemet {
  
  public static void main(String[] args) {
//     int count=1;
//   int max=1;
    int[]arr={1,3,2,1,4,1,4,4,4,4,4,};
//     Arrays.sort(arr);
//     for(int i=0;i<arr.length-1;i++){
//       if(arr[i]==arr[i+1]){
//       count++;
//       }
//       else{
//        max=Math.max(max, count);
//         count=0;
//       }
//     }
// System.out.println(max);
Map<Integer,Integer>freq=new HashMap<>();
for(int el:arr){
  if(!freq.containsKey(el)){
    freq.put(el, 1);
  }
    else{
      freq.put(el, freq.get(el)+1);//value ke liye get
    }
}
System.out.println(freq.entrySet());
  int mxfrq=0,ansKey=-1;
  // for(var e:freq.entrySet()){
  //   if(e.getValue()>mxfrq){
  //     mxfrq=e.getValue();
  //     ansKey=e.getKey();
  //   }
  // }
  for(var key:freq.keySet()){
    if(freq.get(key)>mxfrq){
      mxfrq=freq.get(key);
      ansKey=key;
    }
  }
  System.out.printf("%d has max frequecy and it occurs %d times",ansKey,mxfrq);
  }
}
