package Keyword;

/* 

public class ExceptionDemo {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong ..." + e);
        }
        System.out.println(j);
    }
}

*/

//  TRY WITH MULTIPLE CATCH 

public class ExceptionDemo {
    public static void main(String[] args) {
        
        int i = 3;
        int j = 0;
        String str = null;

        int num[] = new int[5];

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e){
            
            System.out.println("Cannot divide by zero" );
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in ur array limit.");
        }

        catch(Exception e){   // its parent exception class it should be in last. otherwise it will handle all the exception present below.
            System.out.println("Something went wrong .." + e);  
        }

        System.out.println(j);
    }
}


