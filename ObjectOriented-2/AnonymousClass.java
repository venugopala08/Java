
/* 
        ---------- ANONYMOUS CLASS -----

class A{
    public void show(){
        System.out.println("In class A");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        
        A obj = new A()  // It will call anonymous  class which is implemented here itself.it will acts as class. withoud class name.
        {
            public void show(){
                System.out.println("In new class ");
            }
        };

        obj.show();
    }
}

*/



//        -------- ABSTRACT ANONYMOUS CLASS ---------           //



abstract class A{
    public abstract void show();
    public abstract void config();
}



public class AnonymousClass {
    public static void main(String[] args) {
        
//      It will create object of anonymous class not abstract class. so we can define the abstract method here . so we can implement the abstract method in anonymous class.
        A obj = new A()  
        {
            public void show(){  
                System.out.println("In new class ");
            }

            public void config() {

                System.out.println("In a anonymous class ");
            }
        };

        obj.show();
    }
}