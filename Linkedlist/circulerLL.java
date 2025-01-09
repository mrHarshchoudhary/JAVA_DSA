package Linkedlist;
import java.util.*;

public class circulerLL {
   
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   
    public static class CircularLinkedList {
        Node head = null;
        Node tail = null;

      
        void insert(int val) {
            Node newNode = new Node(val);
            if (head == null) { 
                head = newNode;
                tail = newNode;
                newNode.next = head; 
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

    
        int[] calculateSum() {
            if (head == null) return new int[]{0,0};

            int even = 0;
            int odd = 0;

            Node temp = head;

            do { 
                if (temp.data % 2 == 0) {
                    even += temp.data;
                } else {
                    odd += temp.data;
                }
                temp = temp.next;
            } while (temp != head);
           
          
            return new int[]{even,odd};
        }
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Enter the total number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insert(value);
        }

        int[] result= list.calculateSum();
        System.out.println(result[0]+ " "+ result[1]);
       
    }
}
