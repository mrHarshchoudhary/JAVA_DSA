package Tree;
import java.util.*;
public class targetintree {
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
   public static Node search(Node root,int val){
    if(root==null||root.data==val){
      return root;
    }
    if(root.data>val){
      return search(root.left, val);
    }
    else{
      return search(root.right, val);
    }
  }
  public static Node insert(Node root,int val){
    if(root==null){
      root=new Node(val);
      return root;
    }
    if(root.data>val){
      root.left=insert(root.left, val);
    }
    else{
      root.right=insert(root.right, val);
    }
    return root;
  }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size");
    int n=sc.nextInt();
    System.out.println("Enter your target value");
    int target=sc.nextInt();
    int []value=new int[n];
    System.out.println("Enter the value of node/n");
    for(int i=0;i<n;i++){
      value[i]=sc.nextInt();
    }
    System.out.println("The tree node is/n");
    for(int i=0;i<n;i++){
      System.out.print(value[i] + " ");
    }
    Node root=null;
    for(int i=0;i<value.length;i++){
        root=insert(root, value[i]);
    }
    System.out.println();
    if(search(root, target) != null){
      System.out.println("found");
  } else {
      System.out.println("not");
  }
  
  }
}
