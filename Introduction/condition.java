public class condition {
    public static void main(String[] args) {

        System.out.println(" if-else statement example");
        
        // int x = 8;
        /*
        if (x  >10){
             System.out.println("Hello");
        }
        else{
            System.out.println("Bye");    anser is "Bye"
        }
        */
        
        int a = 15;
        if (a  > 10 && a <= 20){            // it accepts the value between 11 to 20 then give "Hello" else  gives "Bye"
             System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }
        
        System.out.println();


        System.out.println("Nested if-else statement example");

        int x = 8;
        int y = 7;
        int z = 9;

        if(x>z && x>z)
            System.out.println("x is greater");
        else if (y>z)
            System.out.println("y is greater");
        else
            System.out.println("z is greater");
    
        
        System.out.println();

        System.out.println("Ternary operator example");

        int num = 9;
        int result = 0;

        // if (num%2 ==0)
        //     result = 1; // even
        // else
        //     result = 2; // odd

        result = num % 2 == 0 ? 1 : 2; // even or odd using ternary operator

        System.out.println(" Result = " + result);


        System.out.println("\n\n");
        System.out.println("Switch statement example");

        int n = 1;
        // if (n ==1)
        //     System.out.println("Monday");
        // else if (n ==2)
        //     System.out.println("Tuesday");
        // else if (n ==3)
        //     System.out.println("Wednesday");
        // else if (n ==4)
        //     System.out.println("Thursday");
        // else if (n ==5)
        //     System.out.println("Friday");
        // else if (n ==6)
        //     System.out.println("Saturday");
        // else if (n ==7)
        //     System.out.println("Sunday");
        // else
        //     System.out.println("Invalid day");


        // Using switch statement
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
