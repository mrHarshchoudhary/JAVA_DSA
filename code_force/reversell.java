package code_force;

import java.util.LinkedList;

public class reversell {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
  }
  public static class LinkedList{
    Node head=null;
    Node tail=null;
    int size=0;
       void insertatend(int val){
        Node temp=new Node(val);
        if(head==null){
          head=temp;
        }
        else{
          tail.next=temp;
        }
        tail=temp;
        size++;
       }
       void reverse(){
        
       }
       
        void display(){
          Node temp=head;
              while(temp!=null){
                  System.out.print(temp.data+" ");
                  temp=temp.next;
              }
         
       }
  }
  public static void main(String[] args) {
    LinkedList ll=new LinkedList();
        ll.insertatend(1);
        ll.insertatend(2);
        ll.insertatend(2);
        ll.insertatend(4);
        ll.insertatend(5);
        ll.insertatend(6);
        ll.insertatend(7);
        ll.insertatend(8);
        System.out.println();
    ll.display();

  }
}
