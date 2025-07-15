package Introduction;

class first_code {

    public static void main(String[] args)
    {
        int num = 5;
        int num2 = 9;
        int result = num + num2;
        System.out.println("Hello, World!");
        System.out.println(3+5);
        System.out.println(num+num2);
        System.out.println("result = " + result);
        float marks = 99.5f;
        System.out.println("marks = " + marks);
        // byte by = 129;     --> gives error as byte can only hold values from -128 to 127
        byte by = 127;
        short sh = 32767;   // short can hold values from -32768 to 32767
        long l = 23249l;     // 'l' is used to denote long literal
        boolean b = true; // boolean can be true or false
        char c = 'A'; // char can hold a single character
        char d = '2'; // char can also hold a digit as a character
        System.out.println("char d = " + d);
        System.out.println("boolean = " + b);
        System.out.println("char = " + c);
        System.out.println("long = " + l);
        System.out.println("byte = " + by);
        System.out.println("short = " + sh);


        // literals
        
        int decimal = 100; // decimal literal
        int hex = 0x64; // hexadecimal literal (0x prefix)
        int octal = 0144; // octal literal (0 prefix)
        int binary = 0b1100100; // binary literal (0b prefix)
        System.out.println("Decimal: " + decimal); 
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + octal);
        System.out.println("Binary: " + binary);
        
        char C = 'a'; // character literal
        C++; // incrementing character
        System.out.println("Character after increment: " + C);  // prints 'b'

        String str = "Hello, Java!"; // String literal
        str += " Welcome to programming."; // concatenating strings
        System.out.println("String: " + str); // prints the concatenated string
}
}