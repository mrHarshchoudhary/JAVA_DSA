package Linkedlist;
public class linkedlist {
    public static void dispalyr(Node head){
        if(head==null)return ;
        dispalyr(head.next);
        System.out.print(head.data+ " ");
       
       
    }
    public static void insertatend(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[]args){
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(8);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //Node temp=a;
    //    while(temp!=null){
    //         System.out.print(temp.data+"->");
    //         temp=temp.next;
    //    }
    //    System.out.println();
    //    dispalyr(a);
    System.out.println(length(a));
    insertatend(a, 87);
    dispalyr(a);
      
    }
}
