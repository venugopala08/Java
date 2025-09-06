package List;
import java.util.*;

public class Vectors {
    public static void main(String []args){

        Vector<String> v = new Vector<String>();
        v.add("Intelipaat");
        v.add("Java");      
        v.add("Training");
        v.add("Course");
        v.add("Vector");
        v.add("Example");
        v.add("Demo");
        v.add("Collections");
        
        System.out.println(v);
        System.out.println("The Element at index 2 is: "+v.get(2));

        //Removal of elements
        v.remove(0);
        v.remove(2);
        System.out.println(v);

        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());                                                                               
        }
    }
    
}
