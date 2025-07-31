package Keyword;

public class TryWithResource {
    public static void main(String[] args) {
        
        int i = 4;
        int j = 0;

        try{
            j = 18/i;
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }

        finally{    // it will print no matter what happens in try-catch .
            System.out.println("Finally block : print irrespective to the Exception.");
        }
    }
}
