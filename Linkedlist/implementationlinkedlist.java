package Linkedlist;
public class implementationlinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    } 
   

    public static class linkedlist{
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
        tail=temp;//both if and else ke liye chelega
        size++;
       }
       void isnertatstart(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
       }
       void insertat(int idx,int val){
        Node t=new Node(val);
        Node temp=head;
        if(idx==size){
            insertatend(val);
            return;
        }
        if(idx==0){
            isnertatstart(val);
            return;
        }
        else if(idx<0||idx>size){
            System.out.println("wrong indx");
            return ;
        }
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;//jis index pr jana he usse ohle ek tk rukk jayega 
        }
        t.next=temp.next;
        temp.next=t;
        size++;

       }
       void deleteatindex(int idx){
        Node temp=head;
        if(idx==0) {
            head=head.next;
            size--;
            return;
        }
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        
        temp.next=temp.next.next;
        tail=temp;
        size--;

       }
       int  getat(int idx){
        Node temp=head;
        for(int i=0;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;
       }
       void display(){
        Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
       }
    //     int size(){    0(n) TC
    // //     Node temp=head;
    // //     int count=0;
    // //     while(temp!=null){
    // //         count++;
    // //         temp=temp.next;
    // //     }
    //     return size;
    //     }
    
    }
    public static void main(String[]args){
        linkedlist ll=new linkedlist();
        ll.insertatend(0);
        ll.insertatend(1);
        ll.insertatend(2);
        ll.insertatend(4);
        ll.display();
        System.out.println();
           // System.out.println(ll.size());
           ll.isnertatstart(45);
           ll.display();
           System.out.println();
           ll.insertat(-1, 78);
           ll.display();
          // System.out.println(ll.tail.data);
          System.out.println();
          System.out.println(ll.getat(3));
          System.out.println();
         System.out.println(ll.size);
         System.out.println();
         ll.deleteatindex(0);
         ll.display();
    }
}
