import java.util.*;

public class PriorityQueues {
    public static void main(String []args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(4);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.add(3);
        System.out.println(pq);

        System.out.println("The head element is: "+pq.peek());

        Iterator<Integer> itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        pq.poll();  // deleting the head element
        System.out.println("After poll function the priority queue is: "+pq);

        System.out.println("After remove function the priority queue is: "+pq.remove());
    }  
}
