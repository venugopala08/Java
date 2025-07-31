import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionAPI {
    public static void main(String[] args) {

        System.out.println("ArrayList Example");
        Collection <Integer> nums = new ArrayList<Integer>();   // <> --> its generic method to set the type. 
        nums.add(6);
        nums.add(7);
        nums.add(8);    
        nums.add(3);

        for (Object num :nums){
            int n = (Integer)num; // This line is incorrect and will cause a compilation error
            System.out.println(n*2);
        }

        System.out.println("List Example");
        List<Integer> num2 = new ArrayList<Integer>();

        num2.add(5);
        num2.add(10);
        num2.add(8);
        num2.add(3);
        System.out.println(num2.get(2));
        System.out.println(num2.indexOf(8));
    }
}
