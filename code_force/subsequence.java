package code_force;

import java.util.ArrayList;
import java.util.List;

public class subsequence {

  public static void solve(int[]arr,int index,List<Integer>newsub,List<List<Integer>> result){
    if(index>=arr.length){
      result.add(new ArrayList<>(newsub));
      return;
    }
    //Exclude
    solve(arr, index+1, newsub, result);
  
  //Include
  int element=arr[index];
  newsub.add(element);
  solve(arr, index+1, newsub, result);

  //breaktracking
  newsub.remove(newsub.size() - 1);
  }
  public static void main(String[] args) {
    int []arr={1,2,3};
    int target=3;
     List<List<Integer>> result = new ArrayList<>();
     List<Integer>newsub=new ArrayList<>();
     int index=0;

     solve(arr,index,newsub,result);
     System.out.println("the subsequnce is: "+ result );
     if(target>=0&&target<result.size()){
      List<Integer>targetsubsequence=result.get(target);
      int sum=0;
      for(int num:targetsubsequence){
        
        sum=sum+num;
      }
      System.out.println("Subsequence at index " + target+ ": " + targetsubsequence);
      System.out.println("the sum is:-" + sum);
  }
  

}
}
