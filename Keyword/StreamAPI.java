import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/*
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // To print all the emements in the list
        // Method 1
        for (int i = 0 ; i < nums.size(); i++)
            System.out.println(nums.get(i));

        System.out.println("\n");

        // Method 2
        for (int num : nums)
            System.out.println(num);

        System.out.println("\n");

        // Method 3
        nums.forEach(n -> System.out.println(n));


        int sum = 0;
        for (int num : nums){
            if(num %2 == 0){
                num = num*2;
                sum += num;
            }
        }
        System.out.println("\n Sum of even numbers multiplied by 2: " + sum);
    }
}

*/


public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
/*
        Stream<Integer> s1 = nums.stream();  // We create Stream from the List . so here we can do the changes which is not effecting the original list.Stream is cannot be reused.
        // s1.forEach(num -> System.out.println(num));
       //  s1.forEach(n -> System.out.println(n)); // This will throw an IllegalStateException because the stream has already been operated upon or closed.

        Stream<Integer> s2 =  s1.filter(n -> n%2 == 0 ); // Filter the stream to get only even numbers
        //s2.forEach(n -> System.out.println(n)); // This will also throw an IllegalStateException because s1 has already been operated upon.
        Stream<Integer> s3 = s2.map(n -> n * 2); // Map the stream to double the even numbers
        // This will print the doubled even numbers
        int result = s3.reduce(0, (c,e) -> c + e);
        System.out.println("Sum of doubled even numbers: " + result); // This will print the sum of doubled even numbers
*/
        // Using Stream API to process the list
        int result = nums.stream()
                .filter(n -> n%2 == 0) // Filter to get only even numbers
                .map(n -> n*2)  // Map to double the even numbers
                .reduce(0, (c,e) -> c+e); // Reduce to sum the doubled even numbers
        System.out.println("Sum of doubled even numbers: " + result); // This will print the sum of doubled even numbers
    }
}