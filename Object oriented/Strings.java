public class Strings {
    public static void main(String[] args) {
        
        // String is not a primitive data type , it is a class in Java

        String name = new String("Venu");
        String name1 = "Venu";  // string can be created using string literal
        
        System.out.println(name.charAt(0));  // to print the specific character of the string

        System.out.println("Name :" + name);
        System.out.println(name.concat("Gowda"));


        System.out.println("\n\n");

        // String Mutable and Immutable

        // Strings are normaly immutable in Java, meaning that once a String object is created, its value cannot be changed.
        // However, you can create a new String object with the modified value.
        
        // String is immutable, meaning once created, it cannot be changed.
        // StrngBuffer and StringBuilder are mutable classes in Java.

        StringBuffer sb = new StringBuffer("Vedhanth");  // StringBuffer is mutable

        System.out.println(sb.capacity());  // Returns the current capacity of the StringBuffer  initially it is 16 . 
                                            // Then it adds the string capacity to it.
        sb.append(" Gowda");            // Appending a string to the StringBuffer
        System.out.println(sb);         // Prints the modified StringBuffer

        sb.insert(9, "K");    // Inserting a character at a specific index

    }
}
