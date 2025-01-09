package Tree.tree;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class levelordertravasal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // static class binaryTree{
    //     static int idx=-1;
    //     public static Node buildtree(int nodes[]){
    //        idx++;
    //         if(nodes[idx]==-1){
    //     return null;
    //         }
    //         Node newNode=new Node(nodes[idx]);
    //         newNode.left=buildtree(nodes);
    //         newNode.right=buildtree(nodes);
    //         return newNode;
    //     }
    // }
    public static void  levelorder(Node root){
        
        if(root==null)return ;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>0){
            Node currndodNode=q.remove();
            if(currndodNode==null){
                System.out.println();
                if(q.size()==0){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currndodNode.data+ " ");
                if(currndodNode.left!=null){
                    q.add(currndodNode.left);
                }
                if(currndodNode.right!=null){
                    q.add(currndodNode.right);
                }
            }
           

        }


    }
    public static void  postorder(Node root){
        if(root==null)return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" ");  
    }
    public static int sumofnodes(Node root){
        if(root==null)return 0;
        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int countofnodes(Node root){
        if(root==null)return 0;
        int leftnode=countofnodes(root.left);
        int rightnode=countofnodes(root.right);
        return leftnode+rightnode+1;
    }
    public static int heightoftree(Node root){
        if(root==null)return 0;
        int leftheight=heightoftree(root.left);
        int rightheight=heightoftree(root.right);
        int myheight=Math.max(leftheight,rightheight)+1;
        return myheight;
    }
    public static int diameteroftree(Node root){
        if(root==null)return 0;
        int diam1=diameteroftree(root.left);
        int diam2=diameteroftree(root.right);
        int diam3=heightoftree(root.left)+heightoftree(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));

    }
    public static void main(String[] args) {
        int count=0;
       // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right=new Node(6);
        root.right.right.right=new Node(7);
        // binaryTree tree=new binaryTree();
        // Node root=tree.buildtree(nodes);
       // postorder(root);
        levelorder(root);
        System.out.println(count);
       System.out.println("the number of nodes is "+ countofnodes(root));
       System.out.println("thesum of node is "+ sumofnodes(root));
       System.out.println("the height of the tree is " + heightoftree(root));
       System.out.println("the diameter of the tree is " + diameteroftree(root));
    }
}
