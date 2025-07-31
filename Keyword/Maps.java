import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Venu",21);
        students.put("Sinchu",22);
        students.put("Manthu",20);    
        students.put("Yogith",24); 
        students.put("Kiran",25); 

        students.put("Manthu",22); // This will update the value for "Manthu"

        System.out.println("Students: " + students);
        System.out.println("Venu's age: " + students.get("Venu"));
        System.out.println("Is Kirran in the map? " + students.containsKey("Kirran"));
        System.out.println(students.keySet()); // Prints all keys
        System.out.println(students.values()); // Prints all values

        System.out.println("\n");

        for (String key : students.keySet()){
            System.out.println("Key: " + key + ", Value: " + students.get(key));
        }
    }
}
