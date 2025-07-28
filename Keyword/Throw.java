package Keyword;

// Throw Exception.
/* 
public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try {
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException("I DONT WANT TO PRINT ZERO");
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong .." + e);
        }

        System.out.println(j);
    }
}


*/



class VenuException extends Exception {
    public VenuException(String str){
        super(str);
    }
}


public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try {
            j = 18/i;
            if(j == 0){
                throw new VenuException("I DONT WANT TO PRINT ZERO");
            }
        }

        catch (VenuException e){
            j = 18/1;
            System.out.println("Thats default output "+e);
        }

        catch (Exception e){
            System.out.println("Something went wrong .." + e);
        }

        System.out.println(j);
    }
}