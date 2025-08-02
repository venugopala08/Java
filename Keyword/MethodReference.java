import java.util.List;
import java.util.Arrays;

public class MethodReference {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Venu", "Sinchu", "Manthu", "Yogith");
        List<String> Unames = names.stream()
        //    .map(name -> name.toUpperCase())  -> Its a normal method.
            .map(String :: toUpperCase) // -> Its a method reference, which is more concise and readable.
            .toList();
        // System.out.println(Unames);
        names.forEach(System.out::println); // Using method reference to print each name
    }
}



