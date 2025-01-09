package JAVA_basic;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[]args){
        ArrayList <Integer> L1=new ArrayList<>();
        //add new element
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(10);
        //get an elemnet at index i
        System.out.println(L1.get(0));
        //printing tha array list directlty
        System.out.println(L1);
        //using for loop printing list
        for(int i=0;i<L1.size();i++){
            System.out.println(L1.get(i));
        }
        //add element in any random index number
        L1.add(1,100);
        System.out.println(L1);
        //modifying element at index i
        L1.set(1, 10);
        System.out.println(L1);
        //remove element in list
        L1.remove(1);
        System.out.println(L1);
        //remove elemnet in list but we dont know what is index value give true false
        L1.remove(Integer.valueOf(8));
        System.out.println(L1);
        //checking if element exist or not
        boolean ans=L1.contains(Integer.valueOf(10));
        System.out.println(ans);
//if you dont specify class you can put everything inside the l
        ArrayList l=new ArrayList();
        l.add("vandana");
        l.add(1);
        l.add("harsh");
        System.out.println(l);
        l.add(1,100);
        System.out.println(l);
        l.lastIndexOf("harsh");
        System.out.println(l);
    }
    
}
