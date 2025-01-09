import java.util.LinkedList;
import java.util.*;
public class queuebasic {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();//remove=poll
        System.out.println(q);
        System.out.println(q.element());//element =peek
    }
   
}
