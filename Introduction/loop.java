public class loop {
    public static void main(String[] args) {
        // For Loop Example
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop Example
        System.out.println("\nWhile Loop Example:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While Loop Example
        System.out.println("\nDo-While Loop Example:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);


        // Nested Loop Example
        System.out.println("\nNested Loop Example:");   
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 2; n++) {
                System.out.println("Outer Loop: " + m + ", Inner Loop: " + n);
            }
        }

        // Enhanced For Loop Example (for-each loop)
        System.out.println("\nEnhanced For Loop Example:"); 
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        System.out.println("\n\n");
    // ---------------------------------------------------------------------------------------------
    

    // while loop example
        System.out.println("While Loop Example:");

        int a = 1;
        while(a<=4){
            System.out.println("Hi " + a);
            a++;
        }
        System.out.println("Bye " + a);
    

        // Nested while loop example
        System.out.println("\nNested While Loop Example:");
        a=1;
        while(a<=4){
            System.out.println("HI" + a);
            int b = 1;
            while(b<=3){
                System.out.println("Hello " + b);
                b++;
            }
            a++;
        }


        // Do-while loop example
        System.out.println("\nDo-While Loop Example:");

        int c = 1;
        do{
            System.out.println("Hi"+ c);    // first iteration will always execute , then checks for the condition. 
            c++;                          //Thats why it is executed at "Hi1" in the begining and terminated after checking the while condition
        }while(c<=0);


        System.out.println("\n\n");
        // For loop example
        System.out.println("\nFor Loop Example:");

        for(int d=1; d<=7; d++){
            System.out.println("Day " + d);
            for(int e=1; e<=9;e++){
                System.out.println(" " + (e+8));  // if i dont put bracket to "" e+8 ""  then it will add as a String
            }
        }
        System.out.println("\n\n");

        int f=1;
        for (;f<=5;){    // its not necessory to to put 3 values inside the loop but we have to maintain 2 ";" inside the loop.
            System.out.println("Hi" + f);     // we have to increment the value in side the curly braces otherwise it becomes infinite . 
            f++;                               //initialize can be done outside the loop also.
        }


        // Enhanced for loop example
        System.out.println("\nEnhanced For Loop Example:");

        int arr[] = {1,2,3,4,5};  // Array declaration and initialization

        for (int n : arr){              // Enhanced for loop to iterate through the array
            // n will take each value from the array arr in each iteration
            System.out.println("Number " + n);
            
        }

        int array[] = new int[4];
        array[0] = 6;
        array[1] = 3;
        array[2] = 9;
        array[3] = 5;

        for (int num : array){          // Enhanced for loop to iterate through the array
            // num will take each value from the array in each iteration
            System.out.println("Array value: " + num);
        }
    }
}
