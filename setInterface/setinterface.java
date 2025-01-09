package setInterface;

import java.util.HashSet;

public class setinterface {
  public static void main(String[] args) {
    HashSet<Integer>st=new HashSet<>();//unorder element hote he 
    
    st.add(1);
    st.add(2);
    st.add(3);
    st.add(3);
    st.remove(2);
    System.out.println(st.contains(1));
    System.out.println(st);
  }
}
