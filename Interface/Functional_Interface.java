package Interface;

// Functional Interface are the interface which is only having single method init.

@FunctionalInterface   // this annotation help to maintain single method.if multple method defines then shows error.
interface FunInt{
    void show();
}

// normal method
// class G implements FunInt{
//     public void show(){
//         System.out.println(" In show");
//     }
// }

public class Functional_Interface {
    public static void main(String[] args) { 
        // Normal method
        // FunInt obj = new B();
        // obj.show();

        // Anonymous inner class
        FunInt obj = new FunInt() {   // we cant create a object of interface .so we can use normal method or anonymous inner class.
            public void show(){
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
