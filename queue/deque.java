import java.util.LinkedList;
import java.util.Deque;
import java.util.*;
public class deque {

    public static void main(String[] args) {
        Deque<Integer>dq=new LinkedList<>();
        // add,remove ,poll peek,
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(8);
        System.out.println(dq);
    }
}
