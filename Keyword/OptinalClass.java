import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptinalClass {  // its introduce to handle null values in a better way

    // Optional is a container object which may or may not contain a value
    // It is used to avoid null checks and NullPointerExceptions
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Venu","Sinchu","Manthu","Yogith");

    // using normal way
        // String name = names.stream()
        //     .filter(str -> str.contains("Y"))
        //     .findFirst()
        //     .orElse("Not Found");
        // System.out.println(name);


    // using Optional class
        Optional<String> name = names.stream()
            .filter(str -> str.contains("Y"))
            .findFirst();
             
        
        System.out.println(name.orElse("Not FOund"));
    }
}
