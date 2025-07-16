class operators {
    public static void main(String[] args) {


        // Arithmetic Operators        // These operators perform basic arithmetic operations
        // +, -, *, /, %        // + is used for addition
        // - is used for subtraction        // * is used for multiplication
        // / is used for division        // % is used for modulus (remainder of division            
        // Example of arithmetic operations
        System.out.println("Arithmetic Operators:");

        int a = 10, b = 20;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

//-----------------------------------------------------------------------------
        int num1 = 10 , num2 = 5;
        int result = num1 % num2;
        System.out.println("Result of mod is " + result);

        int num = 7;
        num += 3;
        System.out.println("After += operation, num1 = " + num);

        num++;  // post-increment
        System.out.println("Incremented num1:" + num);
        num--;  // post-decrement
        System.out.println("Decremented num1:" + num);

        num = 8; // resetting num for increment example
        int res = num++;  // post-increment    --> First fetch the value and then increment the value
        System.out.println("Post-increment result: " + res); // prints 8, num becomes 9 after this line
        System.out.println("Current value of num: " + num); // prints 9

        num = 9; // resetting num for pre-increment example
        res = ++num;  // pre-increment  --> First increment the value and then fetch the value
        System.out.println("Pre-increment result: " + res); // prints 10, num is now 10



        // Relational Operators        // These operators compare two values and return a boolean result
        // ==, !=, >, <, >=, <=        // == checks for equality    
        // != checks for inequality        // > checks if left is greater than right
        // < checks if left is less than right        // >= checks if left is greater than or equal to right
        // <= checks if left is less than or equal to right 
        System.out.println();

        System.out.println("\nRelational Operators:");

        int x = 6, y = 5;

        boolean ans = x<y;
        boolean answer = x > y; // checks if x is greater than y
        System.out.println("Is x greater than y? : " + answer); // prints true
        System.out.println("Is x less than y? : " + ans); // prints false

        boolean equal = x ==  y; // checks if x is equal to y
        System.out.println("Is x equal to y? : " + equal); // prints false

        boolean notequal = x != y; // checks if x is not equal to y
        System.out.println("Is x not equal to y? : " + notequal); // prints true

        // Logical Operators        // These operators perform logical operations
        // &&, ||, !        // && is logical AND
        // || is logical OR        // ! is logical NOT
        System.out.println();   
        System.out.println("\n\n Logical Operators:");

        int d = 10, e = 20, c = 30;
        boolean logicalAnd = (d < e) && (e < c); // true if both are true
        // checks if d is less than e and e is less than c
        boolean logicalAnd2 = (d < e) && (e > c); // false because e is not greater than c
        boolean logicalOr = (d > e) || (e < c); // true if either condition is true
        boolean logicalNot = !(d < e); // true if d is not less than e  but because of not operater it reverses the result  
        System.out.println("Logical AND: " + logicalAnd); // prints true
        System.out.println("Logical AND 2: " + logicalAnd2); // prints false
        System.out.println("Logical OR: " + logicalOr); // prints true
        System.out.println("Logical NOT: " + logicalNot); // prints false

    }
}