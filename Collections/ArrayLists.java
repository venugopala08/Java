import java.util.*;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String []args){
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Intelipaat");
        lst.add("Java");
        lst.add("Training");
        lst.add("Course");
        lst.add("ArrayList");
        lst.add("Example");
        lst.add("Demo");
        lst.add("Collections");

        System.out.println("The Element in the ArrayList are:" + lst);

        System.out.println("The Element at index 2 is: "+lst.get(2));
        lst.set(2,"Updating Training");
        lst.remove(0);
        lst.remove(3);
        System.out.println(lst);

        // Iterating the ArrayList
        Iterator itr = lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // clear function for remove all the elements
        lst.clear();
        System.out.println("The ArrayList after clear function: "+lst);
    }
}