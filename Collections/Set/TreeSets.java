package Set;
import java.util.*;

public class TreeSets {
     public static void main(String []args){
      TreeSet<Integer> ts = new TreeSet<Integer>();

      ArrayList<Integer> al = new ArrayList<Integer>();

      al.add(5);
      al.add(6);
      al.add(3);
      al.add(32);
      al.add(10);
      al.add(14);
      al.add(22);
      al.add(19);
      al.add(3);
      al.add(29);
      al.add(10);

      System.out.println(al);

      ts.addAll(al);
      System.out.println(ts);
      ts.add(1);
      ts.add(11);
      ts.add(88);
      ts.add(28);
      System.out.println(ts);
      
      System.out.println("First element : "+ ts.first());
      System.out.println("First element : "+ ts.last());

      ts.pollFirst();  // Removing first element
      ts.pollLast();  // Removing last element
      System.out.println(ts);

      ts.clear();     // Removing all the elements
      System.out.println(ts);

   }
}
