
package Tree.tree;
import java.util.*; 
public class BST {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){//return type node he kyuki value ko recursive insert krege 
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
           root.left= insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static boolean serch(Node root,int key){
        if(root==null)return false;
        if(root.data>key){
            return serch(root.left, key);
        }
        else if(root.data==key)return true;
        else return serch(root.right, key);

    }
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }
        else{
            // case 1
            if(root.left==null&&root.right==null){
                return null;
            }
            // case2
            if(root.left==null)
            {return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            // case3
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
           root.right= delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
return root;
    }
    public static void inorder(Node root){
        if(root==null)return ;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static void printinRange(Node root,int X,int Y){
        if(root==null)return;
        if(root.data>=X &&root.data<=Y){
            printinRange(root.left, X, Y);
            System.out.println(root.data + " ");
            printinRange(root.right, X, Y);
        }
        else if(root.data>=Y){
            printinRange(root.left, X, Y);
        }
        else{
            printinRange(root.right, X, Y);
        }
    }
    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void printroottoleaf(Node root,ArrayList<Integer>path){
        if(root==null)return ;

        path.add(root.data);
        //leaf
        if(root.left==null&&root.right==null){
            printPath(path);
        }
        else{//non leaf
        printroottoleaf(root.left, path);
        printroottoleaf(root.right, path);
        }
       
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        //  inorder(root);
         System.out.println();

        // if(serch(root, 14)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not found");
        // }
        // delete(root, 5 );
        // inorder(root);
        //printinRange(root, 6, 10);
        printroottoleaf(root, new ArrayList<>());

    }
}
