
// First

class Calculator{

    int a;
    // public int add(int a=num1, int num2){                // this is not allowed in java
    public int add(int a, int b){                          // the parameter name can br same as originala variable name like num1 and num2.
        System.out.println("Addition method called");
        int r = a + b;
        return r;
    }
}

public class democlass {

    public static void main(String[] args) {
        System.out.println("This is a demo class for Java programming.");

        int num1 = 4;
        int num2 = 5;

        // int result = num1+ num2;
        // System.out.println("The result of addition is: " + result);

        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        // int result = calc.add(4,5);      // you can also pass the values directly And also use the same variable name as parameter name.
        System.out.println(result);         // you can use different variable name to call like instead of num1 and num2 you can use a and b.

    }
}
