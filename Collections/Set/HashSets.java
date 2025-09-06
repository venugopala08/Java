package Set;
import java.util.*;

public class HashSets {
    public static void main(String []args){
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();

        HashSet<ArrayList> hs = new HashSet<ArrayList>();

        a1.add(12);
        a1.add(2);
        a1.add(87);
        a2.add(12);
        a2.add(2);
        a2.add(87);
        System.out.println(a1);
        System.out.println(a2);

        hs.add(a1);
        hs.add(a2);

        System.out.println(hs.size()); // Hashset doenst allow duplicates so it saved only one set.
        System.out.println(hs);

        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.add(34);
        hs1.add(23);
        hs1.add(12);
        hs1.add(11);
        hs1.add(12);
        hs1.add(8);
        hs1.add(19);
        hs1.add(19);
        System.out.println(hs1);

        System.out.println("Hash code of the hs1 :"+hs1.hashCode());
        System.out.println("Hash code of the hs :"+hs.hashCode());

        Iterator<Integer> itr = hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        hs1.remove(34);
        hs1.remove(19);
        hs.remove(a1);

        System.out.println(hs1);
        System.out.println(hs);
    }
}
