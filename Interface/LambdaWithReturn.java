package Interface;

// Lambda expression  only works on functional Interface.

@FunctionalInterface
interface J{
    int add(int a , int b);
}

public class LambdaWithReturn {
    public static void main(String[] args) {
        
        J obj = ( a, b) -> a + b;   // --> we dont have to mention datatype of parameter here.

        int result = obj.add(5, 4);
        System.out.println(result);
    }
}
