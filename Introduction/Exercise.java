import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

              // TODO: Use a while loop to keep calculating while 'again' is 'y'
        
        // TODO: Ask user for two numbers
        
        // TODO: Ask user for the operation (+, -, *, /)
        
        // TODO: Use if-else to perform the operation
        
        // TODO: Handle division by zero case
        
        // TODO: Ask if user wants to continue
        
        // TODO: Exit the loop and print a thank you message


        String again = "y";
        
        while(again.equals("y")){
            
            System.out.println("Enter  first number: ");
            double num1 = input.nextInt();
            
            System.out.println("enter second number: ");
            double num2 = input.nextInt();
            
            input.nextLine();
            System.out.println("Choose operation (+,-,*,/):");
            String operator = input.nextLine();
            
            double result = 0;
            if(operator.equals("+")){
                result = num1 + num2;
                System.out.println("Result: "+result);
            }    
            else if(operator.equals("-")){
                result = num1 - num2;
                System.out.println("Result: "+result);
            }
            
            else if(operator.equals("*")){
                result = num1 * num2;
                System.out.println("Result: "+result);
            }
            
            else{
                if(num2 == 0){
                    System.out.println("Cannot divided by zero");
                }
                else{
                    result = num1 / num2;
                    System.out.println("Result: "+result);
                }
            }
            
            System.out.println("Do you want to calculate again?(y/n): ");
            again = input.nextLine();
        
        }
        
        System.out.println("Thank you for using the calculator.");
        input.close();       
    }
}

    

