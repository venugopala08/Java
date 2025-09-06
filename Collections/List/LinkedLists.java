package List;
import java.util.*;

public class LinkedLists {
    public static void main(String []args){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(34);
        ll.add(23);
        ll.add(9);
        ll.add(12);
        ll.add(29);
        ll.add(5);
        ll.add(15);
        System.out.println(ll);

        // Iterating the linked list
        Iterator<Integer> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // removing elements from the linked list

        ll.remove(0);
        ll.remove(3);
        System.out.println(ll);

        System.out.println("The element in the index 2 is : "+ll.get(2));

        // clear function for remove all the elements
        ll.clear();
        System.out.println("The linked list after clear function: "+ll);
    }
}
