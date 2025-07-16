

public class type_conveersion {

    public static void main(String[] args) {
        // Implicit type conversion (widening)
        int intValue = 100;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Conversion:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // Explicit type conversion (narrowing)
        double dValue = 9.78;
        int iValue = (int) dValue; // double to int
        System.out.println("\nExplicit Conversion:");
        System.out.println("double to int: " + iValue); // prints 9, fractional part is truncated

        // Type conversion with characters
        char c = 'A';
        int asciiValue = c; // char to int (ASCII value)
        System.out.println("\nCharacter to ASCII:");
        System.out.println("Character 'A' to ASCII: " + asciiValue);


        //---------------------------------------------------------------------------------------------------------

        byte b = 127;
        //  byte b = 257;  This will cause an error as byte can only hold values from -128 to 127 
        System.out.println("\nByte value: " + b);

        int a = 29;
        byte k = (byte)a; // explicit conversion from int to byte
        System.out.println("Converted int to byte: " + k); // prints 12

        float f = 12.45f;
        int i = (int)f; // explicit conversion from float to int
        System.out.println("Converted float to int: " + i); // prints 12

        byte e = 10;
        byte g = 30;
        int result = e*g; // multiplication of two bytes results in an int 
        // It is called type promotion
        System.out.println("Result of byte multiplication: " + result); // prints 300
    }
}