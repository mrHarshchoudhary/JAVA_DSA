package Tree.tree;

public class basictree {
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
    static class binaryTree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
           idx++;
            if(nodes[idx]==-1){
        return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
    }
    public static void  preorder(Node root){
        if(root==null)return ;
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void  Inorder(Node root){
        if(root==null)return ;
        Inorder(root.left);
        System.out.print(root.data +" ");  
        Inorder(root.right);
    }
    public static void  postorder(Node root){
        if(root==null)return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" ");  
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,4,8,9,10,-1,-1};
        binaryTree tree=new binaryTree();   
       Node root= tree.buildtree(nodes);
      System.out.println(root.data);
       preorder(root);
       System.out.println();
       Inorder(root);
       System.out.println();
       postorder(root);

    }
}
