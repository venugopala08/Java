package Interface;

enum State{
    Running, Failing, Pending, Success;
}

public class Enum_If_switch {
    public static void main(String[] args) {
        
        State s = State.Pending;

    //  Using switch statement

        switch(s){
            case Running :
                System.out.println("All Good...");
                break;

            case Failing :
                System.out.println("Try Again...");
                break;

            case Pending :
                System.out.println("Please Wait...");
                break;

            default :
                System.out.println("Done...");
                break;
        }


    //  Using If-else statement

        if(s == State.Running)
            System.out.println("All Good");

        else if(s == State.Failing)
            System.out.println("Try Again");

        else if(s == State.Pending)
            System.out.println("Please Wait");

        else
            System.out.println("Done");
    }
}