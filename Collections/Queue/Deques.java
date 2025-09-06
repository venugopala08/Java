package Queue;

import java.util.*;

public class Deques {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.add(100);
        dq.add(10);
        dq.add(1);
        dq.add(55);
        dq.addFirst(8);
        dq.addLast(29);
        System.out.println("The deque elements are: " + dq);

        Iterator<Integer> itr = dq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("The first element is: "+dq.getFirst());
        System.out.println("The head element is: "+dq.peek());
        System.out.println("The last element is: "+dq.getLast());
        dq.poll(); // removes the head element
        System.out.println("After poll function the deque elements are: " + dq);
        dq.pop(); // removes the head element
        System.out.println("After pop function the deque elements are: " + dq);
        dq.removeLast(); // removes the last element    
        System.out.println("After removeLast function the deque elements are: " + dq);
        dq.removeFirst(); // removes the first element
        System.out.println("After removeFirst function the deque elements are: " + dq);
        dq.clear();
        System.out.println("After clear function the deque elements are: " + dq);
    }
}
