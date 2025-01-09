package Linkedlist;
public class doublylinkedlist {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
                this.val=val;
        }
    }
    public static void isnertatindex(Node head,int idx,int val){
        Node temp=head;
        Node t=new Node(val);
        for(int i=1;i<idx;i++){
    temp=temp.next;
        }
      temp.next.prev=t;
      t.prev=temp;
      t.next=temp.next;
      temp.next=t;
    }
    public static   Node  insertionathead( Node head,int x){
        Node  t=new Node (x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
        
    }
    public static void displaya(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;

        }
        System.out.println();
    }
    public static void displayrandom(Node random){//random node diya hoga 
        Node temp=random;
        //move this temp to the head;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        //now temp is a head now print ll
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;

        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        //4 10 2 99 13
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        // displaya(a);
        // displayrev(e);
        displayrandom(d);
        // Node newNode=insertionathead(a, 30);
        // displaya(newNode);
       
         isnertatindex(a, 3, 50);
        displaya(a);


    }
}
