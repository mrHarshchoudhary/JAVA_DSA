package Tree.tree;

public class diameteroftree {
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
    static class Treeinfo{
        int ht;
        int diam;
        Treeinfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static Treeinfo diameter(Node root){//return type 2 nhi ho skte esliye void int nhi kliya
        if(root==null){
           return  new Treeinfo(0,0);
        }
        Treeinfo left=diameter(root.left);
        Treeinfo right=diameter(root.right);
        int height=Math.max(left.ht,right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);
        Treeinfo myinfo=new Treeinfo(height, mydiam);
        return myinfo;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right=new Node(6);
            System.out.println(diameter(root).diam);
    }
}
