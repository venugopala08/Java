import java.util.*;

public class LinkedHashSets {
    public static void main(String []args){
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("String");
        lhs.add("Intellipaat");
        lhs.add("Intellipaat");
        lhs.add("Java");
        lhs.add("Coding");
        lhs.add("XYZ");
        lhs.add("XYZ");

        System.out.println(lhs);

        Iterator<String> itr = lhs.iterator();
        System.out.println(" Iteration order of LinkedHashset is:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        String []arr = new String[10];
        arr = lhs.toArray(arr);
        System.out.println("The contents of array are :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Check is XYZ isthe part of thr likedarrayset :"+lhs.contains("XYZ"));

        lhs.remove("String");

        System.out.println(lhs);
    }
}
