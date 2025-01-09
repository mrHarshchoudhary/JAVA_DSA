// Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

// The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

// You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.
// 1 split the String
// 2. string to array
// 3.convet to an integer array //using integer.parseInt(str)
// 4.sort tha array
// 5.append using string builder and change stringbuilder to string using tostring operations

package code_force;

import java.util.Arrays;

public class Helpful_Math {
  public static void main(String[] args) {
    String str="3+2+1";
    String [] numbeStrings=str.split("\\+");
    int []arr=new int[numbeStrings.length];
    for(int i=0;i<numbeStrings.length;i++){
      arr[i]=Integer.parseInt(numbeStrings[i]);
    }
    Arrays.sort(arr);
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<arr.length;i++){
      sb.append(arr[i]);
      if(i<arr.length-1){
        sb.append("+");
      }
    }
System.out.println("The sorted string is " + sb.toString());

  }
}

// normal string convert ke liye split not use 
// simple method like 
// char[] charArray = str.toCharArray();
        
//         // Print the character array
//         for (char c : charArray) {
//             System.out.println(c);

//   2nd one is
//   String[] stringArray = { str }; // Using single element array
        
//         // Alternatively, if you had multiple words:
//         // String[] stringArray = str.split(" "); // Splits by spaces
        
//         // Print the string array
//         for (String s : stringArray) {
//             System.out.println(s);          



