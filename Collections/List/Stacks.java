package List;
import java.util.*;

public class Stacks {
    public static void main(String []args){
     
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(10);
        stk.push(20);
        stk.push(15);
        stk.push(40);
        stk.push(35);
        System.out.println("The element in the stack are: "+stk);

        stk.pop();
        System.out.println("The element in the stack after pop operation: "+stk);

        System.out.println("Searching the element in the stack: "+stk.search(40));
        System.out.println("The element at the top of the stack is: "+stk.peek());

        // Iterating the stack
        Iterator<Integer> itr = stk.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //clearing the stack
        stk.clear();
        System.out.println(stk);
    }
}
