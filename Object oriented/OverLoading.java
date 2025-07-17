
// In method overloading we can have same method name with different parameters and return type.

class Calculate {

    public int calculator(int a , int b){
        System.out.println("Calculator metho eith 2 parameter is called ");    
        return a + b;
    }    

    public int calculator(int a, int b, int c){
        System.out.println("Calculator method with 3 parameter is called ");
        return a + b + c;
    }

    public double calculator(double a, double b){
        System.out.println("Calculator method with 2 double parameter is called ");
        return a + b;
    }
}

public class OverLoading{
    public static void main(String[] args) {
        
        Calculate calc = new Calculate();
        int result = calc.calculator(2,5);
        System.out.println("Result of 2 int parameters: " + result);
        int result2 = calc.calculator(5,6,3);
        System.out.println("Result of 3 int parameters: "+ result2);
        double result3 = calc.calculator(2.5, 3.5);
        System.out.println("Result of 2 double parameters: " + result3);
    }
}