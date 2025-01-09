package Linkedlist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class reversearraylist {
//     static void Areverse(ArrayList<Integer>list){
//         int i=0;
//         int j=list.size()-1;
//         while(i<j){
//             Integer temp=Integer.valueOf(list.get(i));
//             list.set(i,list.get(j));
//             list.set(j,temp);
//             i++;
//             j--;

//         }
//     }
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(9); 
        list.add(5);
        list.add(8);
        System.out.println("original list "+ list);
        // Areverse(list); 
        Collections.reverse(list);
        System.out.println(list);

    }
}
