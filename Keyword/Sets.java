import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        
        Set<Integer> num = new HashSet<Integer>();  
        //  Set<Integer> num = new TreeSet<Integer>(); 
        num.add(1);
        num.add(5);         
        num.add(7);
        num.add(2); 
        num.add(8);
        num.add(5);
        num.add(9);

        Iterator<Integer> values = num.iterator();
        while (values.hasNext()){
            System.out.println(values.next());  // we can use instead of for loop to print the values.
        }
        
        // for (int n : num){
        //     System.out.println(n);  // it doesnt print repeated values and give in sorted set.
        // }
    }
}
