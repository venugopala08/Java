
// Wrapper class is where all the primitive type will have a classs. so we can extends to other class. eg int --> Integer class , doublr --> Double class , char --> Charector class. 

public class Wrapper {
    public static void main(String[] args) {
        
        int num = 7;
        // Integer num1 = new Integer(num);  // Boxing  --> storing a primitive value in a Primitive Object is called Boxing. 

        Integer num1 = num; // Auto-Boxing
        System.out.println(num1);

        // Integer num2 = num1.intValue(); --> Unboxing
        Integer num2 = num1;   // Auto-Unboxing
        System.out.println(num2);


        String str = "12";

        // Now i want to double the value so to achieve that...

        int num3 = Integer.parseInt(str);  // It will covert the string into int.
        System.out.println(num3*2);
    }
}
